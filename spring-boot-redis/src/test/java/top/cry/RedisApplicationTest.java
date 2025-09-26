<<<<<<< HEAD
package top.cry;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RedisApplicationTest {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void test(){
        stringRedisTemplate.opsForValue().set("key","123", 16, TimeUnit.SECONDS);
    }

=======
import static org.junit.jupiter.api.Assertions.*;
class RedisApplicationTest {
  
>>>>>>> c395785a3c535827df18c85d05fc08f3d128dd11
}