package com.scaler.ecommerce.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="Categories")
public class Category extends base{
    private String name;
}
