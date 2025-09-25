package top.cry;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.cry.entity.UserAccount;
import top.cry.mapper.UserAccountMapper;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserAccountMapperTest {
    @Resource
    private UserAccountMapper userAccountMapper;

    @Test
    void testSelectById() {
        UserAccount userAccount = userAccountMapper.selectById(1);
        assertEquals("张三",userAccount.getUsername());
    }

    @Test
    void testSelectCount() {
        Wrapper<UserAccount> wrapper = new QueryWrapper<>();
        long count = userAccountMapper.selectCount(wrapper);
        assertEquals(50,count);
    }

    @Test
    void testInsert() {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("蔡润阳");
        userAccount.setNickname("kimihiro");
        userAccount.setEmail("3012367789@qq.com");
        userAccount.setPhone("15651078712");
        userAccount.setStatus(true);
        userAccount.setDeleted(false);
        userAccount.setCreateTime(LocalDateTime.now());
        userAccount.setUpdateTime(LocalDateTime.now());
        int row = userAccountMapper.insert(userAccount);
        assertEquals(1,row);
    }
}