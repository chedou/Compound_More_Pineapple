package com.jnshu.backendsystem.controller;

import com.aliyun.oss.OSSClient;
import com.jnshu.backendsystem.pojo.Result;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.UUID;

@RestController
public class PhotoUploadController {
    //日志打印
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
    @Value("${endpoint}")
    private String endpoint;

    @Value("${accessKeyId}")
    private String accessKeyId;

    @Value("${accessKeySecret}")
    private String accessKeySecret;

    @Value("${bucketName}")
    private String bucketName;

    @Value("${remoteSrcUrl}")
    private String remoteSrcUrl;

    // TODO: 2018/11/13 图片上传
    @PostMapping("/a/picture")
    public Result uploadPhoto(@RequestParam("file") MultipartFile file) throws IOException {
        Result result = new Result();
        HashMap data = new HashMap();
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        try {
            if (!file.isEmpty()) {
                //获得原来文件名称
                String origionFileName = file.getOriginalFilename();
                InputStream s = file.getInputStream();
                logger.info("上传之前的名称：\n" + origionFileName);
                //随机生成上传图片名称
                String NewFileName = String.valueOf(UUID.randomUUID()) + origionFileName.substring(origionFileName.lastIndexOf("."));
                logger.info("上传的名称为：\n" + NewFileName);

                String showUrl = remoteSrcUrl + "/" + NewFileName;
                // 上传文件流。
                logger.info("\n取得文件流：" + s);
                ossClient.putObject(bucketName, NewFileName, s);
                String msg = "Upload Success!";
                logger.info(msg);
                logger.info("返回地址为：" + showUrl);
                ossClient.shutdown();
                data.put("fileUrl", showUrl);
                result.setCode(1);
                result.setMessage("SUCCESS");
                result.setData(data);
                return result;
            } else {
                result.setCode(40000);
                result.setMessage("上传文件名为空，请核对后再试。");
                return result;
            }
        } catch (RuntimeException e) {
            logger.info(e.toString());
            result.setCode(40001);
            result.setMessage("系统异常，请稍后再试");
            return result;
        }
    }


    // TODO: 2018/11/13 删除上传图片
    @DeleteMapping("/a/picture/fileName")
    public Result deleteUploadPhoto(@RequestParam("fileName")String fileName){
        logger.info("----------输入参数----------");
        logger.info("\n"+"fileName:"+fileName);
        logger.info("----------------------------");
        Result result =new Result();
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        String newFileName=  fileName.substring(fileName.lastIndexOf("/")+1);
        logger.info("截取后的文件名为："+newFileName);
        boolean found = ossClient.doesObjectExist(bucketName, newFileName);
        System.out.println(found);
        if (found){
            try{
                ossClient.deleteObject(bucketName,newFileName);
                ossClient.shutdown();
                result.setCode(1);
                result.setMessage("SUCCESS");
                return result;
            }catch (RuntimeException e){
                e.toString();
                result.setCode(40001);
                result.setMessage("删除失败，请稍后再试");
                return result;
            }
        }else {
            result.setCode(40002);
            result.setMessage("该图片不存在，无需删除！");
            return result;
        }
    }


}
