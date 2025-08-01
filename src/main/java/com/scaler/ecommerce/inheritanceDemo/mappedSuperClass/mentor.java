package com.scaler.ecommerce.inheritanceDemo.mappedSuperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name="msc_mentors")
public class mentor extends user {
    private String companyName;
    private Double avgRating;
}
