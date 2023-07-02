package com.example.matrixapi.services;

import com.example.matrixapi.dto.requests.GaussMethodRequestDTO;
import com.example.matrixapi.dto.responses.GaussMethodResponseDTO;
import com.example.matrixapi.exceptions.errors_400.MatrixBadFormatException;
import com.example.matrixapi.exceptions.errors_404.MatrixNotFoundException;
import com.example.matrixapi.objects.matrix.Matrix;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Data
public class MatrixService {
    private final ModelMapper modelMapper;

    public GaussMethodResponseDTO gauss(GaussMethodRequestDTO gaussMethodDTO) {
        if (gaussMethodDTO == null) {
            throw new MatrixNotFoundException();
        }

        Matrix matrix;
        System.out.println(Arrays.deepToString(gaussMethodDTO.getMatrix()));
        try {
            matrix = new Matrix(gaussMethodDTO.getMatrix());
            matrix.gaussianElimination();
        } catch (Exception e) {
            throw new MatrixBadFormatException();
        }

        System.out.println(matrix);
        return modelMapper.map(matrix, GaussMethodResponseDTO.class);
    }
}
