package org.example.nonparralel;

import org.example.MatrixReader;

import java.io.IOException;
import java.util.Date;

import static org.example.GenerateMatrix.*;
import static org.example.MatrixReader.readMatrixFromFile;


public class Main {
    public static void main(String[] args) throws IOException {
        int[][] matrix1 = readMatrixFromFile(filename1);
        int[][] matrix2 = readMatrixFromFile(filename2);
        int[][] result = new int[n][n];

        long start = System.nanoTime();
        for (int i = 0;i < n;i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        long end = System.nanoTime();

        System.out.println(end-start);

//        for(int[] row: result){
//            for( int var: row){
//                System.out.print(var + " ");
//            }
//            System.out.println();
//        }
    }
}