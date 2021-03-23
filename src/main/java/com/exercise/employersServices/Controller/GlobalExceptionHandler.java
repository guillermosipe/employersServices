package com.exercise.employersServices.Controller;

import com.exercise.employersServices.Pojo.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {RuntimeException.class})
    @ResponseBody
    ResponseEntity<ErrorResponse> runtimeException(HttpServletRequest request, RuntimeException ex) {
        ErrorResponse response = new ErrorResponse("Error", ex.getMessage());
        return new ResponseEntity<ErrorResponse>(response, HttpStatus.BAD_REQUEST);
    }
}