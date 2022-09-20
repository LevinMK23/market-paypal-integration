package com.geekbrains.spring.web.core.converters;

import com.geekbrains.spring.web.api.core.ProductDto;
import com.geekbrains.spring.web.core.entities.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {
    public Product dtoToEntity(ProductDto productDto) {
        return new Product(productDto.getId(), productDto.getTitle(), productDto.getPrice());
    }

    public ProductDto entityToDto(Product product) {
        return new ProductDto(product.getId(), product.getTitle(), product.getPrice());
    }
}
