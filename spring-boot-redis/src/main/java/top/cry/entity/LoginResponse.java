package top.cry.entity;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kimihiro
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {
    private String token;
    private String phone;
    private String message;

    public LoginResponse(String token, String phone) {
        this.token = token;
        this.phone = phone;
        this.message = "登录成功";
    }
=======
public class LoginResponse {
>>>>>>> c395785a3c535827df18c85d05fc08f3d128dd11
}
