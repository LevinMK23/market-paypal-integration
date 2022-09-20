package com.geekbrains.spring.web.core.exceptions;

import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class ValidationException extends RuntimeException {
    private List<String> errorFieldsMessages;

    public ValidationException(List<String> errorFieldsMessages) {
        super(errorFieldsMessages.stream().collect(Collectors.joining(", ")));
        this.errorFieldsMessages = errorFieldsMessages;
    }
}
