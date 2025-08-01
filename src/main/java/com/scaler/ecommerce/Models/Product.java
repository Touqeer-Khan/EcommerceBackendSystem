package com.scaler.ecommerce.Models;

import ch.qos.logback.core.model.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

@Getter
@Setter
@Entity(name= "Products")
public class Product extends base {
    private String title;
    private String description;
    private String imageUrl;
    private double price;
    @ManyToOne
    Category category;

}
