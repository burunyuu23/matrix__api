package com.example.matrixapi.controllers;

import com.example.matrixapi.dto.GaussMethodRequestDTO;
import com.example.matrixapi.dto.GaussMethodResponseDTO;
import com.example.matrixapi.services.MatrixService;
import com.google.gson.Gson;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/matrix")
@Tag(name = "Matrix", description = "Methods of working with the matrix")
public class MatrixController {

    private final MatrixService matrixService;
    private final Gson gson;

    @PostMapping("/gauss")
    @Operation(summary = "Gauss elimination")
    public ResponseEntity<GaussMethodResponseDTO> gauss(
            @RequestBody GaussMethodRequestDTO gaussMethodDTO){
        return ResponseEntity.ok(matrixService.gauss(gaussMethodDTO));
    }
}
