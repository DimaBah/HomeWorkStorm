package HW2;

import java.util.Random;

public class Arrays2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rnd = new Random();
        for (int i = 0; i<10; i++){
            arr[i] = rnd.nextInt(50);
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        int a;
        for (int i = 9; i>0; i--){
            for (int j = 0; j<i; j++) {
                if (arr[j] > arr[j + 1]) {
                    a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        for (int i = 0; i<10; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
