package com.scaler.ecommerce.inheritanceDemo.mappedSuperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name="msc_instructors")
public class instructor extends user {
    private String specialization;
    private Double avgRating;
}
