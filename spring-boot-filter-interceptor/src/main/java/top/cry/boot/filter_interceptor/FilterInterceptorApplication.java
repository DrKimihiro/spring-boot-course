package top.cry.boot.filter_interceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author kimihiro
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FilterInterceptorApplication {
    public static void main(String[] args) {
        SpringApplication.run(FilterInterceptorApplication.class, args);
    }
}
