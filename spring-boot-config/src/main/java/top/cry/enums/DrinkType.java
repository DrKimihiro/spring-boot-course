package top.cry.enums;

import lombok.Getter;

/**
 * @author kimihiro
 */

@Getter
public enum DrinkType {
    COFFEE("咖啡",10.0),
    TEA("茶",8.0),
    JUICE("果汁",5.0);

    private final String label;
    private final double price;

    DrinkType(String label,double price) {
        this.label = label;
        this.price = price;
    }

}
