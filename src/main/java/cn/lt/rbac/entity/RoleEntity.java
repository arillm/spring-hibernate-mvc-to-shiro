package cn.lt.rbac.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleEntity {

    @Id
    private BigInteger id;
    private String name;
    private String desction;
    private Integer remove;

}
