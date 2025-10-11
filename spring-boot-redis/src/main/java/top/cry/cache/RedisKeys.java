<<<<<<< HEAD
package top.cry.cache;


/**
 * @author kimihiro
=======
package top.mqxu.boot.redis.cache;

/**
 * @Author: mqxu
 * @Date: 2025/9/24
>>>>>>> c395785a3c535827df18c85d05fc08f3d128dd11
 */
public class RedisKeys {

    /**
     * 验证码 Key
     */
    public static String getSmsKey(String phone) {
        return "sms:captcha:" + phone;
    }
}