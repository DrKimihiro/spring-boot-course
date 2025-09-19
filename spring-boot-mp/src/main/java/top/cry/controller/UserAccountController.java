package top.cry.controller;

import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.cry.entity.UserAccount;
import top.cry.mapper.UserAccountMapper;

import java.util.List;

/**
 * @author kimihiro
 */
@RestController
@RequestMapping("/user-account")
@RequiredArgsConstructor
@Validated
public class UserAccountController {
    @Resource
    private UserAccountMapper userAccountMapper;

    @GetMapping("/{id}")
    public UserAccount getUserAccountBuyId(@PathVariable Long id) {
        return userAccountMapper.selectById(id);

    }

    @GetMapping("/list")
    public List<UserAccount> list() {
        return userAccountMapper.selectList(null);
    }

    @PostMapping("/add")
    public String add(@RequestBody UserAccount userAccount) {
        userAccountMapper.insert(userAccount);
        return "新增成功";
    }

    @PostMapping("/update")
    public String update(@RequestBody UserAccount userAccount) {
        userAccountMapper.updateById(userAccount);
        return "更新成功";
    }

    @PostMapping("/delete")
    public String delete(@RequestBody UserAccount userAccount) {
        userAccountMapper.deleteById(userAccount);
        return "删除成功";
    }

}
