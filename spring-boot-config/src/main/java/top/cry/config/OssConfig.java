package top.cry.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author kimihiro
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "aliyun-oss")
@PropertySource("classpath:aliyun-oss.properties")
public class OssConfig {
    private String endpoint;
    private String bucket;
    private String accessKey;
    private String secretKey;
    private String dir;
}
