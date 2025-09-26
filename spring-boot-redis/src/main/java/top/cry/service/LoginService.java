package top.cry.service;

import top.cry.entity.LoginRequest;
import top.cry.entity.LoginResponse;

/**
 * @author kimihiro
 */
public interface LoginService {
    LoginResponse login(LoginRequest loginRequest);

}
