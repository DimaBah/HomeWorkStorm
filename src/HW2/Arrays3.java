package HW2;

import java.util.Random;
import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введи размерность матрицы: ");
        int size = Math.abs(scan.nextInt());
        if (size == 0){
            size = 2;
            System.out.println("Матрица будет 2-мерной :))");
        }
        Random rnd = new Random();
        int[][] matr = new int[size][size];
        for (int i = 0; i<size; i++){
            for (int j = 0; j<size; j++){
                matr[i][j] = rnd.nextInt(10);
                System.out.print(matr[i][j] % 2 + "  ");
            }
            System.out.println();
        }
        scan.close();
    }
}
