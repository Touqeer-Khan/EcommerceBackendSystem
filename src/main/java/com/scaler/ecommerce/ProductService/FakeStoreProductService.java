package com.scaler.ecommerce.ProductService;

import com.scaler.ecommerce.Dtos.FakeStoreDtos;
import com.scaler.ecommerce.Models.Category;
import com.scaler.ecommerce.Models.Product;
import com.scaler.ecommerce.Models.base;
import com.scaler.ecommerce.exceptions.productNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@Service
public class FakeStoreProductService implements ProductService{


    private RestTemplate restTemplate;
    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;

    }

    public Product convertFakeStoreDtos(FakeStoreDtos fakeStoreDtos) {
        Product product = new Product();
        product.setId(fakeStoreDtos.getId());
        product.setTitle(fakeStoreDtos.getTitle());
        product.setDescription(fakeStoreDtos.getDescription());
        product.setPrice(fakeStoreDtos.getPrice());
        product.setPrice(fakeStoreDtos.getPrice());

        Category category = new Category();
        category.setName(fakeStoreDtos.getCategory());
        product.setCategory(category);
        return product;
    }
//    @Override
//    public Product getProductById(Long id)   {
//        FakeStoreDtos fakeStoreDtos = restTemplate.getForObject(
//                "https://fakestoreapi.com/products/"+id , FakeStoreDtos.class
//        );
//        return convertFakeStoreDtos(fakeStoreDtos);
//    }
    @Override
    public Product getProductById(Long id) throws productNotFoundException {
        FakeStoreDtos fakeStoreDtos = restTemplate.getForObject(
                "https://fakestoreapi.com/products/"+id , FakeStoreDtos.class
        );
        if (fakeStoreDtos == null){
            throw new productNotFoundException("product with id "+id+" not found");
        }
        return convertFakeStoreDtos(fakeStoreDtos);
    }

    @Override
    public List<Product> getAllProduct() {
        FakeStoreDtos[] fakeStoreDtos = restTemplate.getForObject(
                "https://fakestoreapi.com/products", FakeStoreDtos[].class
        );
        List<Product> products = new ArrayList<>();

        for (FakeStoreDtos fakeStoreDto : fakeStoreDtos) {
            products.add(convertFakeStoreDtos(fakeStoreDto));
        }
        return products;

    }
}
