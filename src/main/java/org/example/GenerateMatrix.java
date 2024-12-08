package org.example;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class GenerateMatrix {
    public static String filename1 = "matrix1.txt";
    public static String filename2 = "matrix2.txt";
    public static int n = 151;
//    public static int n = 3;

    private static void gen(String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            writer.println(n);

            Random rand = new Random();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    writer.print(rand.nextInt(0, 100));
                    if (j < n - 1) {
                        writer.print(" ");
                    }
                }
                writer.println();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws IOException {
        gen(filename1);
        gen(filename2);
    }
}

