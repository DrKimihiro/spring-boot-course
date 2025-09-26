<<<<<<< HEAD
package top.cry.entity;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import top.cry.RedisApplication;

@SpringBootTest(classes = RedisApplication.class)
class StudentTest {
    @Resource
    private RedisTemplate<String, Student> redisTemplate;

    @Test
    void test() {
        Address address=Address.builder()
                .province("广东")
                .city("深圳")
                .build();
        Student student=Student.builder()
                .id("1")
                .name("cry")
                .address(address)
                .build();
        redisTemplate.opsForValue().set("student",student);
    }

=======
import static org.junit.jupiter.api.Assertions.*;
class StudentTest {
  
>>>>>>> c395785a3c535827df18c85d05fc08f3d128dd11
}