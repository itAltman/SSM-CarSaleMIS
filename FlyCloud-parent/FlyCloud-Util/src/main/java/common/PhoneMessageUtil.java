package common;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

import java.util.Random;

/**
 * @description: 发送手机验证码的工具类
 * @author: Altman
 * @date: 2018-05-02 21:03
 */
public class PhoneMessageUtil {

    /**
     * @description: 发送验证码
     * @param:  yanZhengMa验证码，  telphone接收验证码的电话号码
     * @return: boolean
     * @author: Altman
     * @date: 2018-05-02 21:08
    **/
    public boolean sandMassage(String yanZhengMa,String telphone){

        //设置超时时间-可自行调整
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");
        //初始化ascClient需要的几个参数
        final String product = "Dysmsapi";//短信API产品名称（短信产品名固定，无需修改）
        final String domain = "dysmsapi.aliyuncs.com";//短信API产品域名（接口地址固定，无需修改）
        //替换成你的AK
        final String accessKeyId = "LTAIPNBqAs1k3WoK";//你的accessKeyId,参考本文档步骤2
        final String accessKeySecret = "S03o6IEQKD6i9fSsRxcHpQRXdofh83";//你的accessKeySecret，参考本文档步骤2
        //初始化ascClient,暂时不支持多region（请勿修改）
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId,
                accessKeySecret);
        try {
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
        } catch (ClientException e) {
            e.printStackTrace();
        }
        IAcsClient acsClient = new DefaultAcsClient(profile);
        //组装请求对象

        SendSmsRequest srequest = new SendSmsRequest();
        //使用post提交
        srequest.setMethod(com.aliyuncs.http.MethodType.POST);
        //必填:待发送手机号。支持以逗号分隔的形式进行批量调用，批量上限为1000个手机号码,批量调用相对于单条调用及时性稍有延迟,验证码类型的短信推荐使用单条调用的方式
        srequest.setPhoneNumbers(telphone);
        //必填:短信签名-可在短信控制台中找到
        srequest.setSignName("飞云科技");
        //必填:短信模板-可在短信控制台中找到
        srequest.setTemplateCode("SMS_134110204");
        //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
        //友情提示:如果JSON中需要带换行符,请参照标准的JSON协议对换行符的要求,比如短信内容中包含\r\n的情况在JSON中需要表示成\\r\\n,否则会导致JSON在服务端解析失败
        srequest.setTemplateParam("{\"name\":\"Tom\", \"code\":\""+yanZhengMa+"\"}");
        //可选-上行短信扩展码(扩展码字段控制在7位或以下，无特殊需求用户请忽略此字段)
        //request.setSmsUpExtendCode("90997");
        //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
        srequest.setOutId("yourOutId");
        //请求失败这里会抛ClientException异常
        SendSmsResponse sendSmsResponse=null;
        try {
            sendSmsResponse = acsClient.getAcsResponse(srequest);
        } catch (ClientException e) {
            e.printStackTrace();
        }
        if(sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
            //请求成功,则将验证码返回给页面,肯用户填写的是否正确
            return true;
        }
        return false;
    }

    /**
     * @description: 生成随机密码
     * @param:  pwd_len密码总长度
     * @return: String
     * @author: Altman
     * @date: 2018-05-02 21:08
    **/
    public String genRandomNum(int pwd_len) {
        // String re="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&]).{10,}";
        @SuppressWarnings("unused")
        String regex = "^(?![0-9]+$)(?![a-zA-Z]+$)[A-Za-z0-9@#$%]{8,16}$";
        //35是因为数组是从0开始的，26个字母+10个数字
        final int maxNum = 26;
        int i;  //生成的随机数
        int count = 0; //生成的密码的长度
        char[] str = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z'};
        char[] upChar = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
                'X', 'Y', 'Z'};
        char[] numChar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] speChar = {'!', '@', '#', '$', '%'};

        StringBuffer pwd = new StringBuffer("");
        Random r = new Random();
       /* while (count < pwd_len) {
            //生成随机数，取绝对值，防止生成负数，
            i = Math.abs(r.nextInt(maxNum));  //生成的数最大为36-1
            if (i >= 0 && i < str.length) {
                pwd.append(str[i]);
                count++;
            }
        }*/
        /*
        count=0;
        while (count < 2) {
            //生成随机数，取绝对值，防止生成负数，
            i = Math.abs(r.nextInt(7));  //生成的数最大为7-1
            if (i >= 0 && i < upChar.length) {
                pwd.append(upChar[i]);
                count++;
            }
        }
        */
        count=0;
        while (count < pwd_len) {
            //生成随机数，取绝对值，防止生成负数，
            i = Math.abs(r.nextInt(maxNum));  //生成的数最大为10-1
            if (i >= 0 && i < numChar.length) {
                pwd.append(numChar[i]);
                count++;
            }
        }
        /*
        count=0;
        while (count < 2) {
            //生成随机数，取绝对值，防止生成负数，
            i = Math.abs(r.nextInt(maxNum));  //生成的数最大为10-1
            if (i >= 0 && i < speChar.length) {
                pwd.append(speChar[i]);
                count++;
            }
        }*/
        return pwd.toString();
    }

}
