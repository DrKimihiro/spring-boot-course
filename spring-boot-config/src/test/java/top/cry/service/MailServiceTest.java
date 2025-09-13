package top.cry.service;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import top.cry.model.Mail;

import java.io.File;

@SpringBootTest
class MailServiceTest {
    @Resource
    private MailService mailService;
//    @Test
//    void sendSimpleMail() {
//        Mail mail = new Mail();
//        mail.setTo("3012367789@qq.com");
//        mail.setSubject("测试简单邮件");
//        mail.setContent("是谁住在深海的大菠萝里？海绵宝宝！");
//        mailService.sendSimpleMail(mail);
//    }

    @Test
    void sendAttachmentsMail() throws Exception {
        Mail mail = new Mail();
        mail.setTo("16422802@qq.com");
        mail.setSubject("测试带附件的邮件");
        mail.setContent("带附件的邮件内容");

        // 本地文件
        File file1 = new File("C:/Users/kimihiro/Desktop/新建文件夹/njgy.jpg");
        File file2 = new File("C:/Users/kimihiro/Desktop/新建文件夹/Screenshot_20250129-114041.png");

        // File 转换为 MultipartFile
        MultipartFile[] files = new MultipartFile[2];
        files[0] = new MockMultipartFile(file1.getName(), // 参数名
                file1.getName(), // 原始文件名
                "image/jpeg", // contentType
                FileCopyUtils.copyToByteArray(file1) // 文件字节
        );
        files[1] = new MockMultipartFile(file2.getName(),
                file2.getName(),
                "image/jpeg",
                FileCopyUtils.copyToByteArray(file2)
        );

        mailService.sendAttachmentsMail(mail, files);
    }

}