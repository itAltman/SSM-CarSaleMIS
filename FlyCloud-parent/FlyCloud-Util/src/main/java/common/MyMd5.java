  package common;

import java.security.MessageDigest;

public class MyMd5 {  
      
    public static void main(String[] args) {  
//        String pwd = getMD5("password");  
        String pwd = getMD5("123456");
        System.out.println(pwd);  
    }  
   
   //����MD5  
    public static String getMD5(String message) {  
        String md5 = "";  
        try {  
            MessageDigest md = MessageDigest.getInstance("MD5");  // ����һ��md5�㷨����  
            byte[] messageByte = message.getBytes("UTF-8");  
            byte[] md5Byte = md.digest(messageByte);              // ���MD5�ֽ�����,16*8=128λ  
            md5 = bytesToHex(md5Byte);                            // ת��Ϊ16�����ַ���  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return md5;  
    }  
   
     // ������תʮ������  
    public static String bytesToHex(byte[] bytes) {  
        StringBuffer hexStr = new StringBuffer();  
        int num;  
        for (int i = 0; i < bytes.length; i++) {  
            num = bytes[i];  
             if(num < 0) {  
                 num += 256;  
            }  
            if(num < 16){  
                hexStr.append("0");  
            }  
            hexStr.append(Integer.toHexString(num));  
        }  
        return hexStr.toString().toUpperCase();  
    } 
    
   
}