package com.step.bootcamp.matrix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    private ArrayList<ArrayList<Integer>> elementsOfMatrix1;
    private ArrayList<ArrayList<Integer>> elementsOfMatrix2;

    @BeforeEach
    void setUp() {
        elementsOfMatrix1 = new ArrayList<>();
        elementsOfMatrix2 = new ArrayList<>();

        elementsOfMatrix1.add(new ArrayList<>(asList(1, 0, 0)));
        elementsOfMatrix1.add(new ArrayList<>(asList(0, 1, 0)));
        elementsOfMatrix1.add(new ArrayList<>(asList(0, 0, 1)));

        elementsOfMatrix2.add(new ArrayList<>(asList(1, 1, 1)));
        elementsOfMatrix2.add(new ArrayList<>(asList(2, 2, 2)));
        elementsOfMatrix2.add(new ArrayList<>(asList(3, 3, 3)));

    }

    @Test
    void shouldCompareTwoMatrices() {

        Matrix matrix1 = new Matrix(elementsOfMatrix1);
        Matrix matrix2 = new Matrix(elementsOfMatrix2);

        assertNotEquals(matrix1, matrix2);
    }

    @Test
    void shouldCompareTwoMatricesAsEqual() {
        ArrayList<ArrayList<Integer>> elementsOfMatrix = new ArrayList<>();

        elementsOfMatrix.add(new ArrayList<>(asList(1, 0, 0)));
        elementsOfMatrix.add(new ArrayList<>(asList(0, 1, 0)));
        elementsOfMatrix.add(new ArrayList<>(asList(0, 0, 1)));

        Matrix matrix = new Matrix(elementsOfMatrix);
        Matrix matrix1 = new Matrix(elementsOfMatrix1);
        assertEquals(matrix, matrix1);

    }

    @Test
    void shouldReturnTransposeOfGivenMatrix() {

        ArrayList<ArrayList<Integer>> elementsOfMatrix = new ArrayList<>();

        elementsOfMatrix.add(new ArrayList<>(asList(1, 2, 3)));
        elementsOfMatrix.add(new ArrayList<>(asList(1, 2, 3)));
        elementsOfMatrix.add(new ArrayList<>(asList(1, 2, 3)));

        Matrix matrix = new Matrix(elementsOfMatrix);
        Matrix transpose = new Matrix(elementsOfMatrix2);
        assertEquals(transpose, matrix.transpose());

    }

    @Test
    void shouldPerformAdditionOfTwoMatrices() {
        Matrix matrix1 = new Matrix(elementsOfMatrix1);
        Matrix matrix2 = new Matrix(elementsOfMatrix2);

        ArrayList<ArrayList<Integer>> elementsOfResultedMatrix = new ArrayList<>();
        elementsOfResultedMatrix.add(new ArrayList<>(asList(2, 1, 1)));
        elementsOfResultedMatrix.add(new ArrayList<>(asList(2, 3, 2)));
        elementsOfResultedMatrix.add(new ArrayList<>(asList(3, 3, 4)));

        Matrix resultedMatrix = new Matrix(elementsOfResultedMatrix);

        assertEquals(resultedMatrix, matrix1.add(matrix2));
    }

    @Test
    void shouldPerformMultiplicationOfTwoMatrices() {

        Matrix matrix1 = new Matrix(elementsOfMatrix1);
        Matrix matrix2 = new Matrix(elementsOfMatrix2);

        ArrayList<ArrayList<Integer>> elementsOfResultedMatrix = new ArrayList<>();
        elementsOfResultedMatrix.add(new ArrayList<>(asList(1, 0, 0)));
        elementsOfResultedMatrix.add(new ArrayList<>(asList(0, 2, 0)));
        elementsOfResultedMatrix.add(new ArrayList<>(asList(0, 0, 3)));

        Matrix resultedMatrix = new Matrix(elementsOfResultedMatrix);

        assertEquals(resultedMatrix, matrix1.multiply(matrix2));
    }

    @Test
    void shouldThrowInvalidMatrixToMultiplyException() {
        Matrix matrix1 = new Matrix(elementsOfMatrix1);


        ArrayList<ArrayList<Integer>> elementsOfMatrix2 = new ArrayList<>();
        elementsOfMatrix2.add(new ArrayList<>(asList(1, 0)));
        elementsOfMatrix2.add(new ArrayList<>(asList(0, 2)));

        Matrix matrix2 = new Matrix(elementsOfMatrix2);

        assertThrows(InvalidMatrixToMultiplyException.class, () -> matrix1.multiply(matrix2));
    }
}
