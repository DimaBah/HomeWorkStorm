package HW2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Rekurs {
    static String prost(int n, int x) {
        if (x == n) {
            return "YES";
        }
        if (n % x == 0) {
            return "NO";
        }
        else {
            return prost (n, x + 1);
        }
     }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введи число для проверки >2: ");
        int n = Math.abs(scan.nextInt());
        if (n < 3) {
            n = 7;
            System.out.println("Будет число 7, иначе скучно :))");
        }
        String pr;
        pr = prost (n, 2);
        System.out.printf("Is number %d", n);
        System.out.printf(" simple - %s", pr );
    }
}
