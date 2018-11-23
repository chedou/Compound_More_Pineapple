package com.jnshu.backendsystem.utils;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


public class MsmUtil {
        //产品名称:云通信短信API产品,开发者无需替换
        static final String product = "Dysmsapi";
        //产品域名,开发者无需替换
        static final String domain = "dysmsapi.aliyuncs.com";
        // TODO 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)
        private static String accessKeyId="LTAI2TGWKVTWNgdn";
        private static String accessKeySecret="wrYXWEhkr8MjnNZ1E2WJHthZvXRfAY";
        private static String signName="美文欣赏258";
        private static String templateCode="SMS_151090534";

        public void setAccessKeyId(String accessKeyId) {
            MsmUtil.accessKeyId = accessKeyId;
        }
        public void setAccessKeySecret(String accessKeySecret) {
            MsmUtil.accessKeySecret = accessKeySecret;
        }
        public void setSignName(String signName) {
            MsmUtil.signName = signName;
        }
        public void setTemplateCode(String templateCode) {
            MsmUtil.templateCode = templateCode;
        }
    public static SendSmsResponse sendSmsCode(String phone,String code) throws ClientException {
        System.out.println("111111111111111111111111111\n"+phone+"\n"+code);
        //可自助调整超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");

        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象-具体描述见控制台-文档部分内容
        SendSmsRequest request = new SendSmsRequest();
        //必填:待发送手机号
        request.setPhoneNumbers(phone);
        //必填:短信签名-可在短信控制台中找到
        request.setSignName(signName);
        //必填:短信模板-可在短信控制台中找到
        request.setTemplateCode(templateCode);
        //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为，但不能注释掉
        request.setTemplateParam("{\"code\":\"" + code + "\"}");
        //hint 此处可能会抛出异常，注意catch
        try {
            SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
            return sendSmsResponse;
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return null;

    }
}
