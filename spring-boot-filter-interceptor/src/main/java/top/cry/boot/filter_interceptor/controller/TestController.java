package top.cry.boot.filter_interceptor.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {
    @GetMapping("/test")
    public String get(){
        log.info("进入controller");
        return "hello world";

    }
}
