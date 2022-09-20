package com.geekbrains.spring.web.core.validators;

import com.geekbrains.spring.web.api.core.ProductDto;
import com.geekbrains.spring.web.core.exceptions.ValidationException;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductValidator {
    public void validate(ProductDto productDto) {
        List<String> errors = new ArrayList<>();
        if (productDto.getPrice().compareTo(BigDecimal.ONE) < 0) {
            errors.add("Цена продукта не может быть меньше 1");
        }
        if (productDto.getTitle().isBlank()) {
            errors.add("Продукт не может иметь пустое название");
        }
        if (!errors.isEmpty()) {
            throw new ValidationException(errors);
        }
    }
}
