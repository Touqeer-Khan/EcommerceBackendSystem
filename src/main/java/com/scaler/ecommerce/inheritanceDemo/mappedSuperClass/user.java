package com.scaler.ecommerce.inheritanceDemo.mappedSuperClass;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class user {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
}
