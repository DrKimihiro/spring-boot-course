package top.cry;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author kimihiro
 *
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableScheduling // 启用定时任务
public class WebSocketApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(WebSocketApplication.class, args);
    }
}
