package HW2;

import java.util.Random;
import java.util.Scanner;

public class Uslov_Console {
    public static void main(String[] args) {
        // 1
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сторону a: ");
        int a = in.nextInt();
        System.out.print("Введите сторону b: ");
        int b = in.nextInt();
        System.out.print("Введите радиус r: ");
        int r = in.nextInt();
        if (r < (Math.sqrt(a*a + b*b))/2){
            System.out.println("Круг не закроет прямоугольник");
        }
        else {
            System.out.println("Круг закроет прямоугольник");
        }
        in.close();
        // 2
        Random rnd = new Random();
        int day = 1 + rnd.nextInt(7);
        switch (day){
            case 1:
                System.out.println("Пондельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
        }
        System.out.println("Для проверки: " + day);
    }
}
