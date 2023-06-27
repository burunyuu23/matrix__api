package com.example.matrixapi.objects.matrix;

import lombok.Data;

@Data
public class Matrix {
    private double[][] matrix;
    private double[] x;
    private int rows;
    private int columns;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.columns = matrix[0].length;
        this.x = new double[rows];
    }

    public void gaussianElimination() {
        for (int pivot = 0; pivot < rows - 1; pivot++) {
            if (matrix[pivot][pivot] == 0) {
                if (!swapRowsWithNonZeroElement(pivot)) {
                    continue;
                }
            }

            for (int row = pivot + 1; row < rows; row++) {
                double factor = matrix[row][pivot] / matrix[pivot][pivot];
                for (int col = pivot; col < columns; col++) {
                    matrix[row][col] -= factor * matrix[pivot][col];
                }
            }
        }

        x[rows - 1] = matrix[rows - 1][columns - 1]/matrix[rows - 1][rows - 1];

        for (int i = rows - 2; i >= 0; i--) {
            double temp = 0;
            for (int j = i+1; j < rows; j++) {
                temp += matrix[i][j]*x[j];
            }
            x[i] = 1/matrix[i][i]*(matrix[i][columns - 1] - temp);
        }
    }

    private boolean swapRowsWithNonZeroElement(int pivot) {
        for (int row = pivot + 1; row < rows; row++) {
            if (matrix[row][pivot] != 0) {
                double[] temp = matrix[pivot];
                matrix[pivot] = matrix[row];
                matrix[row] = temp;
                return true;
            }
        }
        return false;
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void printX() {
        for (int i = 0; i < rows; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
