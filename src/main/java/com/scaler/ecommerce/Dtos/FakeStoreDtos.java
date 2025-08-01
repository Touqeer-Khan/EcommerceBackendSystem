package com.scaler.ecommerce.Dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreDtos {
    private Long id;
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;
}
