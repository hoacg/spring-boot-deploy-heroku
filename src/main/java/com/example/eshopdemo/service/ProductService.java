package com.example.eshopdemo.service;

import com.example.eshopdemo.model.Product;
import com.example.eshopdemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product getById(Long id) {

        Optional<Product> productOptional = this.productRepository.findById(id);

        if (productOptional.isPresent()) {
            return productOptional.get();
        } else {
            throw new RuntimeException("Không tìm thấy sản phẩm");
        }
    }
}
