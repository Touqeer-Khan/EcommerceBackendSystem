package com.scaler.ecommerce.inheritanceDemo.singleTable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st_user")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name="user_type",
        discriminatorType=DiscriminatorType.INTEGER

)
@DiscriminatorValue(value = "0")
public class user {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
}
