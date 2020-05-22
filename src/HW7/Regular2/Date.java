package HW7.Regular2;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        String str = "2019/02/05 13:00:50";
        boolean result = str.matches("[0-9]{4}/(0[1-9]|1[012])/(0[1-9]|1[0-9]|2[0-9]|3[01]) ([0-1]\\d|2[0-3])(:[0-5]\\d){2}$");
        System.out.println(result);
        System.out.println("Enter data in YYYY/MM/DD HH:MM:SS format: ");
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        System.out.println(string.matches("[0-9]{4}/(0[1-9]|1[012])/(0[1-9]|1[0-9]|2[0-9]|3[01]) ([0-1]\\d|2[0-3])(:[0-5]\\d){2}$"));
    }
}
