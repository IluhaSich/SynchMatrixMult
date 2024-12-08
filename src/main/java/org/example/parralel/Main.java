package org.example.parralel;

import java.io.FileNotFoundException;
import java.lang.Thread;

import static org.example.GenerateMatrix.*;
import static org.example.MatrixReader.readMatrixFromFile;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int[][] matrix1 = readMatrixFromFile(filename1);
        int[][] matrix2 = readMatrixFromFile(filename2);
        int[][] result = new int[n][n];
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            new Thread(new ColumnThread(i, result, matrix1, matrix2)).start();
        }
        long end = System.nanoTime();
        System.out.println(end - start);
//        for (int[] row : result) {
//            for (int var : row) {
//                System.out.print(var + " ");
//            }
//            System.out.println();
//        }
    }
}
// Замер времени на одном потоке
//19740500
//16729000 // лучшее время
//21361900
//21763200
//24815700
//24377400
//16510300
//19350400
//20399200
//19043700
//17639200

// Замер времени на синхронизированных n потоках
//20059200 // худшее время
//10975200 // лучшее время
//13374200
//13374200
//18712800
//12769400
//12508700
//12630400
//11272300
//15587000
//12537100
