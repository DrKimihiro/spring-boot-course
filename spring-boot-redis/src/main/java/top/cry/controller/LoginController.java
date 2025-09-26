package top.cry.controller;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.cry.entity.LoginRequest;
import top.cry.entity.LoginResponse;
import top.cry.result.Result;
import top.cry.service.LoginService;

/**
 * @author kimihiro
 */
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class LoginController {
    private final LoginService loginService;

    @PostMapping("/login")
    public Result<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        LoginResponse loginResponse = loginService.login(loginRequest);
        return Result.ok(loginResponse);
    }
=======
public class LoginController {
>>>>>>> c395785a3c535827df18c85d05fc08f3d128dd11
}
