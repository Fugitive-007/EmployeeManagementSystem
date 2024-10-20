package com.project.ems.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler 
{
   @ExceptionHandler(ResourceNotFoundException.class) 
   public ResponseEntity<?> recordNotFoundException(ResourceNotFoundException exception)
   {
     return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
   }
}
