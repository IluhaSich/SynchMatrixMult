package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.example.GenerateMatrix.n;

public class MatrixReader {

    public static int[][] readMatrixFromFile(String str) throws FileNotFoundException {
        File file = new File(str);
        Scanner scanner = new Scanner(file);
        int[][] matrix = new int[n][n];
        scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        return matrix;
    }
}

