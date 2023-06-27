package com.example.matrixapi;

import com.example.matrixapi.objects.matrix.Matrix;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTest {
    @Test
    void matrix() {
        double[][] inputMatrix = {
                {18,7,-6,3,41},
                {3,15,-3,4,89},
                {1,-3,8,2,-36},
                {2,-5,4,13,-13}
        };

        Matrix matrix = new Matrix(inputMatrix);
        System.out.println("Original Matrix:");
        matrix.printMatrix();

        matrix.gaussianElimination();
        System.out.println("\nMatrix after Gaussian elimination:");
        matrix.printMatrix();

        System.out.println("\nX:");
        matrix.printX();

        assertEquals("[-1.0, 5.0, -3.0, 2.0]", Arrays.toString(matrix.getX()));
    }

    @Test
    void resistanceMatrix() {
        double[][] inputMatrix = {
                {1,-1,0,0,0,0,0,0},
                {0,1,-1,-1,0,0,0,0},
                {0,0,0,1,-1,-1,-1,0},
                {0,12,0,23,0,0,4,1},
                {0,0,2,-23,-6,0,0,0},
                {0,0,0,0,-6,5,0,0},
                {0,0,0,0,0,-5,4,0},
        };

        Matrix matrix = new Matrix(inputMatrix);
        System.out.println("Original Matrix:");
        matrix.printMatrix();

        matrix.gaussianElimination();
        System.out.println("\nMatrix after Gaussian elimination:");
        matrix.printMatrix();

        System.out.println("\nX:");
        matrix.printX();

        // Силы тока по очереди. Самое первое значение это сила тока на проводах, которые мы подключаем к крайним узлам
        assertEquals("[0.07220348922445388, 0.07220348922445388, 0.06677906465327664, 0.005424424571177247, 0.0014660606949127692, 0.001759272833895323, 0.0021990910423691544]", Arrays.toString(matrix.getX()));
    }
}
