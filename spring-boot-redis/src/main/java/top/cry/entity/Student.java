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
public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = -8168289683106601277L;

    private String id;
    private String name;
    private Address address;


=======
public class Student {
>>>>>>> c395785a3c535827df18c85d05fc08f3d128dd11
}
