package top.cry.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.cry.cache.RedisCache;
import top.cry.cache.RedisKeys;
import top.cry.entity.LoginRequest;
import top.cry.entity.LoginResponse;
import top.cry.enums.ErrorCode;
import top.cry.exception.ServerException;
import top.cry.service.LoginService;
import top.cry.utils.CommonUtils;

import java.util.UUID;

/**
 * @author kimihiro
 */
@Slf4j
@Service
@AllArgsConstructor
public class LoginServiceImpl implements LoginService {
    private final RedisCache redisCache;

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        String phone = loginRequest.getPhone();
        String inputCode = loginRequest.getCode();

        // 1.校验手机号码格式
        if (!CommonUtils.checkPhone(phone)) {
            throw new ServerException(ErrorCode.INTERNAL_SERVER_ERROR);
        }

        // 2.校验验证码是否为空
        if (inputCode == null || inputCode.trim().isEmpty()) {
            throw new ServerException("验证码不能为空");
        }

        // 3.从Redis中获取验证码
        String redisKey = RedisKeys.getSmsKey(phone);
        String redisCode = redisCache.get(redisKey).toString();

        // 4.验证码不存在或已过期
        if (redisCode == null) {
            throw new ServerException("验证码已过期或不存在");
        }

        // 5.验证码不匹配
        if (!inputCode.equals(redisCode)) {
            throw new ServerException("验证码错误");
        }

        // 6.验证成功，删除Redis中的验证码
        redisCache.delete(redisKey);

        // 7.生成token并返回登录信息
        String token = generateToken(phone);

        log.info("用户 {} 登录成功", phone);
        return new LoginResponse(token, phone);
    }

    private String generateToken(String phone) {
        return UUID.randomUUID().toString().replace("-", "") + phone.hashCode();
    }
}
