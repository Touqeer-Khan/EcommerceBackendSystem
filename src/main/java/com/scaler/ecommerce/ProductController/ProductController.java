package com.scaler.ecommerce.ProductController;


import com.scaler.ecommerce.Models.Product;
import com.scaler.ecommerce.ProductService.ProductService;
import com.scaler.ecommerce.exceptions.productNotFoundException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(@Qualifier("selfProductService") ProductService productService) {
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

    @PostMapping()
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable ("id")  Long id){
        productService.deleteProductById(id);
    }

}
