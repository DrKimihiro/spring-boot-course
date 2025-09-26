package top.cry.enums;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author kimihiro
 */

@Getter
@AllArgsConstructor
public enum ErrorCode {
    UNAUTHORIZED(401, "登陆失败，请重新登录"), INTERNAL_SERVER_ERROR(500, "服务器异常，请稍后再试"),
    CODE_SEND_FAIL(3001, "短信发送失败"), SMS_CODE_ERROR(3002, "短信验证码错误"), PARAMS_ERROR(3003, "参数错误");

    private final int code;
    private final String message;

    public String getMsg() {
        return message;
    }
=======
public enum ErrorCode {
>>>>>>> c395785a3c535827df18c85d05fc08f3d128dd11
}
