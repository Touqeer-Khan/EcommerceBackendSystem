package com.scaler.ecommerce.inheritanceDemo.mappedSuperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name="msc_tas")
public class ta extends user {
    private int numberOfHR;
}
