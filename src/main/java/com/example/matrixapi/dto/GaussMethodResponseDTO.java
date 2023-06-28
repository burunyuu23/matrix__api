package com.example.matrixapi.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Response from gauss elimination")
public class GaussMethodResponseDTO {
    @Schema(description = "Variables double[] after gauss elimination")
    private double[] variables;
}
