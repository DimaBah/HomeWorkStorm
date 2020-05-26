package HW7.Regular1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAdress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some IPAdress: ");
        String str = scan.next();
        Pattern pattern = Pattern.compile("(127|255).(\\d{1,3}).(\\d{1,3}).(\\d{1,3})");
        Matcher matcher = pattern.matcher(str);
        System.out.println(str + " --- " + matcher.matches());
        String str1 = "127.011.0.1";
        Matcher matcher1 = pattern.matcher(str1);
        System.out.println(str1 + " --- " + matcher1.matches());
        String str2 = "qaz.011.0.1";
        Matcher matcher2 = pattern.matcher(str2);
        System.out.println(str2 + " --- " + matcher2.matches());
    }
}
