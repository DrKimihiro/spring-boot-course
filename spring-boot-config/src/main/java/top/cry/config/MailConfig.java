package top.cry.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author kimihiro
 */
@Data
@ConfigurationProperties(prefix = "mail")
@PropertySource("classpath:mail.properties")
@Configuration
public class MailConfig {
    private String host;
    private String username;
    private String password;
    private String protocol;
    private String propertiesMailSmtpAuth;
    private String propertiesMailSmtpPort;
    private String propertiesMailDisplaySendmail;
    private String propertiesMailDisplaySendname;
    private String propertiesMailSmtpStarttlsEnable;
    private String propertiesMailSmtpStarttlsRequired;
    private String propertiesMailSmtpSslEnable;
    private String defaultEncoding;

}
