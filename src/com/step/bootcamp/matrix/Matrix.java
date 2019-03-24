package com.step.bootcamp.matrix;

import java.util.ArrayList;
import java.util.Objects;

class Matrix {

    private ArrayList<ArrayList<Integer>> matrix;

    Matrix(ArrayList<ArrayList<Integer>> matrix) {
        this.matrix = matrix;
    }

    ArrayList<ArrayList<Integer>> create() {
        ArrayList<ArrayList<Integer>> elements = new ArrayList<>();
        for (int index = 0; index < this.matrix.size(); index++) {
            elements.add(new ArrayList<>());
        }
        return elements;
    }

    Matrix transpose() {
        ArrayList<ArrayList<Integer>> transposeMatrix = create();
        int noOfRows = this.matrix.size();
        for (int rowIndex = 0; rowIndex < noOfRows; rowIndex++) {
            ArrayList<Integer> row = this.matrix.get(rowIndex);
            for (int colIndex = 0; colIndex < row.size(); colIndex++) {
                transposeMatrix.get(rowIndex).add(matrix.get(colIndex).get(rowIndex));
            }
        }
        return new Matrix(transposeMatrix);
    }

    Matrix add(Matrix otherMatrix) {
        ArrayList<ArrayList<Integer>> resultMatrix = create();
        int noOfRows = this.matrix.size();
        for (int rowIndex = 0; rowIndex < noOfRows; rowIndex++) {
//            ArrayList<Integer> rowOfFirst = this.matrix.get(rowIndex);
//            ArrayList<Integer> rowOfSecond = otherMatrix.matrix.get(rowIndex);
//            for (int index = 0; index < rowOfFirst.size(); index++) {
//                int sum = rowOfFirst.get(index) + rowOfSecond.get(index);
//                resultMatrix.get(rowIndex).add(sum);
//            }
//
            for (int i = 0; i < this.matrix.get(0).size(); i++) {
                Integer element1 = this.matrix.get(rowIndex).get(i);
                Integer element2 = otherMatrix.matrix.get(rowIndex).get(i);
                resultMatrix.get(rowIndex).add(element1 + element2);
            }
        }
        return new Matrix(resultMatrix);
    }

    @Override
    public boolean equals(Object otherMatrix) {
        if (this == otherMatrix) return true;
        if (otherMatrix == null || getClass() != otherMatrix.getClass()) return false;
        Matrix matrix1 = (Matrix) otherMatrix;
        return Objects.equals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matrix);
    }


}

