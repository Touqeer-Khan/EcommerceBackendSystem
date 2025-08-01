package com.scaler.ecommerce.ProductService;

import com.scaler.ecommerce.Models.Product;
import com.scaler.ecommerce.exceptions.productNotFoundException;
import com.scaler.ecommerce.repositories.productRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("selfProductService")
public class selfProductService implements ProductService {

    private productRepository productRepository;
    public selfProductService(productRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProductById(Long id) throws productNotFoundException {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isEmpty()){
            throw new productNotFoundException("Product with id " + id + " not found");
        }
        return optionalProduct.get();
    }

    @Override
    public List<Product> getAllProduct() {
        return List.of();
    }
}
