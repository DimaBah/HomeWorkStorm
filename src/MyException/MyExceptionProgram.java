package MyException;

import java.util.Scanner;

public class MyExceptionProgram {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();
        Circle cir = new Circle();
        try {
            System.out.println("Square of rectangle is: " + rec.square(2, 4));
        } catch (UnluckyNumberException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Square og triangle is: " + tri.square(5, 6));
        } catch (UnluckyNumberException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Square of circle is: " + cir.square(3, Math.PI));
        } catch (UnluckyNumberException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Square of rectangle is: " + rec.square(2, 13));
        } catch (UnluckyNumberException e) {
            e.printStackTrace();
        }
    }
}
