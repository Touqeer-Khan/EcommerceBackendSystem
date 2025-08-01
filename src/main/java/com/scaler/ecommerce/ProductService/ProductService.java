package com.scaler.ecommerce.ProductService;

import com.scaler.ecommerce.Models.Product;
import com.scaler.ecommerce.exceptions.productNotFoundException;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id) throws productNotFoundException;
    List<Product> getAllProduct();

}
