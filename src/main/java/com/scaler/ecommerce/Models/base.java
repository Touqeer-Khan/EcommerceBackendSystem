package com.scaler.ecommerce.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class base {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
