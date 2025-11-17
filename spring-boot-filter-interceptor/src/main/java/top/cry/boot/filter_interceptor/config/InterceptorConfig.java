package top.cry.boot.filter_interceptor.config;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.cry.boot.filter_interceptor.interceptor.Myinterceptor;

/**
 * @author kimihiro
 */
@Configuration
@Slf4j
public class InterceptorConfig implements WebMvcConfigurer {
    @Resource
    private Myinterceptor myinterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myinterceptor).addPathPatterns("/test");
    }
}
