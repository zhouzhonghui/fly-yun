package cn.fly.yun.utils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author zzh
 * @date 2018-07-26
 * @desc 增加对前端的请求进行防止篡改的工具类
 */
public class SignInterfaceUtils {

    /**
     * 签名的算法，通过整个报文体，requestUri,时间戳，nonce来对
     * 整个上送的数据进行签名，密钥客户端自己保留
     * 采用hmac256的算法
     *
     * @param data
     * @param requestUri
     * @param timestramp
     * @param nonce
     * @param sercyKey
     * @return
     */
    public static String signIn(String data, String requestUri, String timestramp, String nonce, String sercyKey) {
        String buffer = data + requestUri + timestramp + nonce;
        String hash=sha256_HMAC(buffer,sercyKey);
        return hash;
    }


    /**
     * sha256_HMAC加密 * * @param message *消息 * @param secret *秘钥 * @return 加密后字符串
     */
    private static String sha256_HMAC(String message, String secret) {
        String hash = "";
        try {
            Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
            SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
            sha256_HMAC.init(secret_key);
            byte[] bytes = sha256_HMAC.doFinal(message.getBytes());
            hash = byteArrayToHexString(bytes);
        } catch (Exception e) {
            System.out.println("Error HmacSHA256 ===========" + e.getMessage());
        }
        return hash;
    }

    /**
     * 将加密后的字节数组转换成字符串 * * @param b *字节数组 * @return 字符串
     */
    private static String byteArrayToHexString(byte[] b) {
        StringBuilder hs = new StringBuilder();
        String stmp;
        for (int n = 0; b != null && n < b.length; n++) {
            stmp = Integer.toHexString(b[n] & 0XFF);
            if (stmp.length() == 1) hs.append('0');
            hs.append(stmp);
        }
        return hs.toString();
    }

    /**
     * 比较两个时间戳是否大于5分钟，如果大于5分钟就提示错误
     * @param currentTimes
     * @param alongTimes
     * @return
     */
    public static boolean compareTimesSeconds(Long currentTimes,Long alongTimes){
        boolean flag=true;
        System.out.println(currentTimes+"######"+alongTimes+"########"+(currentTimes-alongTimes));
        Long diff=(currentTimes-alongTimes)/(1000*60);
        if(diff>5){
            flag=false;
        }
        return flag;
    }


    public static void main(String[] args) {
        String hash=sha256_HMAC("zhouzhonghui","abcd");
        System.out.println(hash);
    }

}
