package top.cry.config;

<<<<<<< HEAD
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author kimihiro
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "cry.sms.ccp")
public class CloopenConfig {
    private String serverIp;
    private String port;
    private String accountSid;
    private String accountToken;
    private String appId;
    private String templateId;
=======
public class CloopenConfig {
>>>>>>> c395785a3c535827df18c85d05fc08f3d128dd11
}
