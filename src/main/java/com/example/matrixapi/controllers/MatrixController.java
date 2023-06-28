package com.example.matrixapi.controllers;

import com.example.matrixapi.dto.GaussMethodRequestDTO;
import com.example.matrixapi.dto.GaussMethodResponseDTO;
import com.example.matrixapi.services.MatrixService;
import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/matrix")
public class MatrixController {

    private final MatrixService matrixService;
    private final Gson gson;

    @PostMapping("/gauss")
    public ResponseEntity gauss(@RequestBody GaussMethodRequestDTO gaussMethodDTO){
        return ResponseEntity.ok(matrixService.gauss(gaussMethodDTO));
    }
}
