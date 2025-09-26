package top.cry.controller;

<<<<<<< HEAD
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.cry.result.Result;
import top.cry.service.SmsService;


/**
 * @author kimihiro
 */
@RestController
@RequestMapping("/api")
public class SmsController {
    @Resource
    private SmsService smsService;

    @GetMapping("/sms/send")
    public Result<Boolean> sendSms(@RequestParam String phone){
        return Result.ok(smsService.sendSms(phone));
    }
=======
public class SmsController {
>>>>>>> c395785a3c535827df18c85d05fc08f3d128dd11
}
