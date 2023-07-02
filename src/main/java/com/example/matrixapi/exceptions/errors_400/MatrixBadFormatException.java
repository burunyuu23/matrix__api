package com.example.matrixapi.exceptions.errors_400;

import com.example.matrixapi.exceptions.AppException;
import org.springframework.http.HttpStatus;

public class MatrixBadFormatException extends AppException {
    public MatrixBadFormatException() {
        super("Matrix shouldn't be strange", HttpStatus.BAD_REQUEST);
    }
}