package top.cry.service;

import org.springframework.web.multipart.MultipartFile;
import top.cry.enums.ResultStatus;
import top.cry.model.Mail;


/**
 * @author kimihiro
 */
public interface MailService {

    ResultStatus sendSimpleMail(Mail mail);
    /**
     * 发送HTML邮件
     *
     * @param mail
     * 邮件信息
     */
    ResultStatus sendHTMLMail(Mail mail);
    /**
     * 发送带附件的邮件
     *
     * @param mail  邮件信息
     * @param files 附件文件
     * @return 邮件发送结果
     */
    ResultStatus sendAttachmentsMail(Mail mail, MultipartFile[] files);

}
