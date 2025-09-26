<<<<<<< HEAD
package top.cry.config;
=======
package top.mqxu.boot.redis.config;
>>>>>>> c395785a3c535827df18c85d05fc08f3d128dd11


import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

<<<<<<< HEAD

/**
 * @author kimihiro
=======
/**
 * @Author: mqxu
 * @Date: 2025/9/24
>>>>>>> c395785a3c535827df18c85d05fc08f3d128dd11
 */
@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setKeySerializer(RedisSerializer.string());
        template.setHashKeySerializer(RedisSerializer.string());

        FastJsonRedisSerializer<Object> serializer = new FastJsonRedisSerializer<>(Object.class);
        template.setValueSerializer(serializer);
        template.setHashValueSerializer(serializer);

        template.setConnectionFactory(factory);
        return template;
    }

    static class FastJsonRedisSerializer<T> implements RedisSerializer<T> {
        public static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;
        private final Class<T> clazz;

        public FastJsonRedisSerializer(Class<T> clazz) {
            super();
            this.clazz = clazz;
        }

        @Override
        public byte[] serialize(T t) throws SerializationException {
            if (null == t) {
                return new byte[0];
            }
            return JSON.toJSONString(t, JSONWriter.Feature.WriteClassName).getBytes(DEFAULT_CHARSET);
        }

        @Override
        public T deserialize(byte[] bytes) throws SerializationException {
            if (null == bytes || bytes.length == 0) {
                return null;
            }
            String str = new String(bytes, DEFAULT_CHARSET);
            return JSON.parseObject(str, clazz);
        }
    }

}