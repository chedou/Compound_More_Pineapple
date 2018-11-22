package com.jnshu.backendsystem.controller;

import com.jnshu.backendsystem.pojo.Result;
import com.jnshu.backendsystem.service.ModuleTableService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class ModuleTableController {
    @Autowired
    private ModuleTableService moduleTableService;

    //日志打印
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    // TODO: 2018/11/8 获取模块管理列表
    @GetMapping(value = "/a/manage/module")
    public Result getqureyModuleList(Integer page,Integer size){
        HashMap data=new HashMap();
        Result result=new Result();
        List list =new ArrayList();
        // TODO: 2018/11/8 分页功能后续再加
        logger.info("-----------输入请求参数---------");
        logger.info("page:"+page+"\n"+"size:"+size+"\n" );
        logger.info("--------------------------------");
        try{
            list=moduleTableService.qureyModuleList();
            data.put("getqureyModuleList",list);
            result.setCode(0);
            result.setMessage("SUCCESS");
            result.setData(data);
            return result;
        }catch (RuntimeException e){
            logger.info(e.toString());
            result.setCode(40001);
            result.setMessage("系统繁忙，请稍后重试");
            return result;
        }
    }

    // TODO: 2018/11/8 新增模块信息
    @PostMapping("/a/manage/module")
    public Result insertModuleInfo(String name,String menuld,String url,Integer parentModuleId,String moduleCategory,String createBy,Long gmtCreate){
        Result result=new Result();
        logger.info("-----------输入请求参数---------");
        logger.info("\n"+"name:"+name+"\n"+"menuld:"+menuld+"\n"+"url:"+url+"\n"+"parentModuleId:"+parentModuleId+"\n" +"moduleCategory:"+moduleCategory+"\n"+"createBy:"+createBy+"\n"+"gmtCreate:"+gmtCreate+"\n"   );
        logger.info("--------------------------------");
        try{
            Integer i=moduleTableService.insertModuleInfo(name, menuld, url, parentModuleId, moduleCategory, createBy,gmtCreate);
            result.setCode(i);
            result.setMessage("SUCCESS");
        }catch (RuntimeException e){
            e.toString();
            result.setCode(40001);
            result.setMessage("系统繁忙，请稍后重试");
        }
        return result;
    }

    // TODO: 2018/11/8 更新模块信息
    @PutMapping("/a/manage/module/{id}")
    public Result updateModuleById(@PathVariable Integer id,String name,String menuld,String url,Integer parentModuleId,String moduleCategory, String updateBy, Long gmtUpdate){
        Result result=new Result();
        logger.info("-----------输入请求参数---------");
        logger.info("\n"+"id:"+id+"\n"+"name:"+name+"\n"+"menuld:"+menuld+"\n"+"url:"+url+"\n"+"parentModuleId:"+parentModuleId+"\n" +"moduleCategory:"+moduleCategory+"\n"+"createBy:"+updateBy+"\n"+"gmtCreate:"+gmtUpdate+"\n"   );
        logger.info("--------------------------------");
        try{
            Integer i=moduleTableService.updateModuleById(id,name, menuld, url, parentModuleId, moduleCategory, updateBy,gmtUpdate);
            result.setCode(i);
            result.setMessage("SUCCESS");
        }catch (RuntimeException e){
            e.toString();
            result.setCode(40001);
            result.setMessage("系统繁忙，请稍后重试");
        }
        return result;
    }

    // TODO: 2018/11/8 删除模块信息
    @DeleteMapping("/a/manage/module/{id}")
    public Result deleteModuleById(@PathVariable Integer id){
        Result result=new Result();
        logger.info("-----------输入请求参数---------");
        logger.info("\n"+"id:"+id+"\n" );
        logger.info("--------------------------------");
        try{
            Integer i=moduleTableService.deleteModuleById(id);
            result.setCode(i);
            result.setMessage("SUCCESS");
        }catch (RuntimeException e){
            e.toString();
            result.setCode(40001);
            result.setMessage("系统繁忙，请稍后重试");
        }
        return result;
    }

    // TODO: 2018/11/8 查询单个模块信息
    @GetMapping("/a/manage/module/{id}")
    public Result qureyModuleInfoById(@PathVariable Integer id){
        Result result=new Result();
        HashMap data=new HashMap();
        logger.info("-----------输入请求参数---------");
        logger.info("\n"+"id:"+id+"\n" );
        logger.info("--------------------------------");
        try{
            List list=moduleTableService.qureyModuleInfoById(id);
            result.setCode(1);
            result.setMessage("SUCCESS");
            data.put("qureyModuleInfoById",list);
            result.setData(data);
            return result;
        }catch (RuntimeException e){
            e.toString();
            result.setCode(40001);
            result.setMessage("系统繁忙，请稍后重试");
            return result;
        }
    }
}
