package com.example.matrixapi.controllers.advice;


import com.example.matrixapi.dto.responses.ErrorResponseDTO;
import com.example.matrixapi.exceptions.AppException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequiredArgsConstructor
public class RestExceptionHandler {
    private final ModelMapper modelMapper;

    @ExceptionHandler(value = {AppException.class})
    public ResponseEntity<ErrorResponseDTO> handleAppException(AppException exception) {
        return ResponseEntity.status(exception.getStatus())
                .body(modelMapper.map(exception, ErrorResponseDTO.class));
    }
}
