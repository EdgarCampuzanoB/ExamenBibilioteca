package com.example.ExamenBiblioteca.configuration;

import com.example.ExamenBiblioteca.controller.CustomerNotExistException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionCustomerHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({CustomerNotExistException.class})
    protected ResponseEntity<Object> handleNotFound(
            Exception ex, WebRequest request){
        return handleExceptionInternal(ex, "Client not found",
        new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
}
