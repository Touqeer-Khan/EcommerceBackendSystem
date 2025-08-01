package com.scaler.ecommerce.controllerAdvices;

import com.scaler.ecommerce.Models.Product;
import com.scaler.ecommerce.exceptions.productNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class globalExceptionhandler {

    @ExceptionHandler(productNotFoundException.class)
    public ResponseEntity<String> handleProductNotFoundException (productNotFoundException ex){
        return new ResponseEntity<>
                (ex.getMessage(), HttpStatus.NOT_FOUND);

    }
}
