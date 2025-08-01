package com.scaler.ecommerce.inheritanceDemo.tablePerClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_mentors" )
public class mentor extends user {
    private String companyName;
    private Double avgRating;
}
