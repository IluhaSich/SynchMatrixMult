package org.example.parralel;

import static org.example.GenerateMatrix.*;
import static org.example.MatrixReader.readMatrixFromFile;

public class ColumnThread implements Runnable{
    private int column;
    int[][] result;
    int[][] matrix1;
    int[][] matrix2;

    public ColumnThread(int column, int[][] result, int[][] matrix1, int[][] matrix2) {
        this.column = column;
        this.result = result;
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    @Override
    public void run() {
        for(int j = 0; j < n; j++){
            for(int k = 0; k < n; k++){
                result[column][j] += matrix1[column][k] * matrix2[k][j];
            }
        }
    }
}
