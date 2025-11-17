package top.cry.boot.filter_interceptor.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.time.LocalDateTime;

/**
 * @author kimihiro
 */
@Component
@Slf4j
public class Myinterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        log.info("进入拦截器，请求路径为：{}",requestURI);
        LocalDateTime beginTime = LocalDateTime.now();
        request.setAttribute("beginTime",beginTime);
        return true;

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        LocalDateTime beginTime = LocalDateTime.now();
        log.info("开始时间:{}",beginTime);
        LocalDateTime endTime = LocalDateTime.now();
        String requestURI = request.getRequestURI();
        log.info("拦截器执行结束:{}{}",requestURI,endTime);
        log.info("耗时:{}",endTime.getNano()-beginTime.getNano());
    }
}

