package com.hackerrank.restcontrolleradvice.exception;

import com.hackerrank.restcontrolleradvice.dto.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class FizzBuzzExceptionHandler extends ResponseEntityExceptionHandler {

    //TODO:: implement handler methods for FizzException, BuzzException and FizzBuzzException

    @ResponseBody
    @ExceptionHandler(FizzBuzzException.class)
    @ResponseStatus(HttpStatus.INSUFFICIENT_STORAGE)
    public GlobalError handleException(FizzBuzzException e, HttpServletRequest request) {
        return new GlobalError(e.getMessage(), e.getErrorReason());
    }

    @ResponseBody
    @ExceptionHandler(BuzzException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public GlobalError handleException(BuzzException e, HttpServletRequest request) {
        return new GlobalError(e.getMessage(), e.getErrorReason());
    }

    @ResponseBody
    @ExceptionHandler(FizzException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public GlobalError handleException(FizzException e, HttpServletRequest request) {
        return new GlobalError(e.getMessage(), e.getErrorReason());
    }
}
