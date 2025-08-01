package com.scaler.ecommerce.ProductController;


import com.scaler.ecommerce.Models.Product;
import com.scaler.ecommerce.ProductService.ProductService;
import com.scaler.ecommerce.exceptions.productNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
//    public Product getProductById(@PathVariable("id") long id){
//        return productService.getProductById(id);
    public ResponseEntity<Product> getProduct(@PathVariable ("id")  Long id) throws productNotFoundException {
        Product product= productService.getProductById(id);

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

//    }

    @GetMapping()
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }
}
