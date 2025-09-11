package top.cry.model;


import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author kimihiro
 */
@Data
@Component
public class Team {
    @Value("${team.name}")
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 3, max = 20,message = "长度在3-20个字符之间")
    private String name;

    @Value("${team.leader}")
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 3, max = 8, message = "长度在3-8个字符之间")
    private String leader;

    @Value("${team.phone}")
    @Pattern(regexp = "^[0-9]{11}$", message = "手机号格式错误")
    private String phone;

    @Value("${team.age}")
    @NotNull
    @NotEmpty
    @NotBlank
    @Min(value = 1,message = "年龄不能小于1岁")
    @Max(value = 4,message = "年龄不能大于4岁")
    private Integer age;

    @Past
    private LocalDate createTime;
}
