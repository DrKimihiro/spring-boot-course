package top.cry.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kimihiro
 */
@RestController
public class HelloController {

    //读取“开关状态”和“提示语”
    @Value("${my.feature.helloSwitch}")
    private boolean isHelloSwitch;
    @Value("${my.feature.closeMsg}")
    private String closeMsg;
    //带开关的接口 接口访问路径为：http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello(){
        // 根据开关状态返回不同的响应信息
        if(isHelloSwitch){
            return "接口开放中，欢迎访问^x^" + "\n" + "Hello World!";
        }else{
            return closeMsg;
        }
    }



}
