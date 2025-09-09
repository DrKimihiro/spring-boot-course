package top.cry.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.cry.service.SmsService;


/**
     * @author kimihiro
     */
    @RestController
    public class SmsController {
        @Resource
        private SmsService smsService;

        @GetMapping("/Sms")
        public void sendSms(String phone) {
            smsService.sendSms(phone);
        }
    }
