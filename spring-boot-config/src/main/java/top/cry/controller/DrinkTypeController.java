package top.cry.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.cry.enums.DrinkType;

/**
 * @author kimihiro
 */
@RestController
@RequestMapping("/drink")
public class DrinkTypeController {
    @RequestMapping("/{type}")
    public String getDrinkType(@PathVariable DrinkType type) {
        return "您选择的饮料是:"+type.getLabel()+" 价格为:"+ type.getPrice();
    }

}
