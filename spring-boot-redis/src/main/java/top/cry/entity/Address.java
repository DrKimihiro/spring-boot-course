package top.cry.entity;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author kimihiro
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address implements Serializable {

    @Serial
    private static final long serialVersionUID = 2803531146275725476L;

    private String province;
    private String city;
    private Address address;
=======
public class Address {
>>>>>>> c395785a3c535827df18c85d05fc08f3d128dd11
}
