package com.scaler.ecommerce.ProductService;

import com.scaler.ecommerce.Models.Category;
import com.scaler.ecommerce.Models.Product;
import com.scaler.ecommerce.exceptions.productNotFoundException;
import com.scaler.ecommerce.repositories.categoryRepository;
import com.scaler.ecommerce.repositories.productRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("selfProductService")
public class selfProductService implements ProductService {

    private productRepository productRepository;
    private categoryRepository categoryRepository;
    public selfProductService(productRepository productRepository, categoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
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

    @Override
    public Product createProduct(Product product) {
        Category category=product.getCategory();

        Optional<Category> categoryOptional=categoryRepository.findByName(category.getName());
        if (categoryOptional.isEmpty()){
            categoryRepository.save(category);
        }
        product.setCategory(category);
        return productRepository.save(product);



    }

    @Override
    public void deleteProductById(Long id){
        productRepository.deleteById(id);
    }
}
