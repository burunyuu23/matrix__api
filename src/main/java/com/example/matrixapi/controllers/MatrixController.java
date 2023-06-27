package com.example.matrixapi.controllers;

import com.example.matrixapi.services.MatrixService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/matrix")
public class MatrixController {

    private final MatrixService matrixService;


}
