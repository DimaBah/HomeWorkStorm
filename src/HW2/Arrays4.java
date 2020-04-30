package HW2;

import java.util.Random;

public class Arrays4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int stroka = 1 + rnd.nextInt(10);
        int[][] arr = new int[stroka][];
        for (int i = 0; i<stroka; i++){
            int dlina = 1 + rnd.nextInt(10);
            arr[i] = new int[dlina];
            for (int j = 0; j<dlina; j++) {
                arr[i][j] = rnd.nextInt(25); // Рандомный рандом))
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
