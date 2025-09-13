package top.cry.enums;

import lombok.Getter;

/**
 * @author kimihiro
 */

@Getter
public enum ExpressStatus {
    CREATED("已揽收"),
    TRANSMIT("运输中"),
    SUCCESS("已签收");

    private final String label;

    ExpressStatus(String label) {
        this.label = label;
    }

}
