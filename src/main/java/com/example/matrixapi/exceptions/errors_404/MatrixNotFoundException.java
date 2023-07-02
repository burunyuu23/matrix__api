package com.example.matrixapi.exceptions.errors_404;

import com.example.matrixapi.exceptions.AppException;
import org.springframework.http.HttpStatus;

public class MatrixNotFoundException extends AppException {
    public MatrixNotFoundException() {
        super("Matrix shouldn't be null", HttpStatus.NOT_FOUND);
    }
}
