package com.geekbrains.spring.web.cart.integrations;

import com.geekbrains.spring.web.api.core.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ProductsServiceIntegration {
    private final RestTemplate restTemplate;

    @Value("${integrations.core-service.url}")
    private String productServiceUrl;

    public Optional<ProductDto> findById(Long id) {
        ProductDto productDto = restTemplate.getForObject(productServiceUrl + "/api/v1/products/" + id, ProductDto.class);
        return Optional.ofNullable(productDto);
    }
}
