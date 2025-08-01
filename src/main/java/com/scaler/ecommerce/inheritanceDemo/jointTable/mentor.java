package com.scaler.ecommerce.inheritanceDemo.jointTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_mentors")
@PrimaryKeyJoinColumn(name = "user_id")
public class mentor extends user {
    private String companyName;
    private Double avgRating;
}
