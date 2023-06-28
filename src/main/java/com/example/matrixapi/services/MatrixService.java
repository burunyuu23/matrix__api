package com.example.matrixapi.services;

import com.example.matrixapi.dto.GaussMethodRequestDTO;
import com.example.matrixapi.dto.GaussMethodResponseDTO;
import com.example.matrixapi.objects.matrix.Matrix;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Data
public class MatrixService {
    private final ModelMapper modelMapper;

    public GaussMethodResponseDTO gauss(GaussMethodRequestDTO gaussMethodDTO) {
        Matrix matrix = new Matrix(gaussMethodDTO.getMatrix());
        matrix.gaussianElimination();

        return modelMapper.map(matrix, GaussMethodResponseDTO.class);
    }
}
