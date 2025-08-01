package com.scaler.ecommerce.inheritanceDemo.tablePerClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_instructors")
public class instructor extends user {
    private String specialization;
    private Double avgRating;
}
