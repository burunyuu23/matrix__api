package com.example.matrixapi.dto.requests;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Request on gauss elimination")
public class GaussMethodRequestDTO {
    @Schema(description = "Matrix in double[][]")
    private double[][] matrix;
}
