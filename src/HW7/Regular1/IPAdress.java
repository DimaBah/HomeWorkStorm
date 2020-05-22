package HW7.Regular1;

public class IPAdress {
    public static void main(String[] args) {
        String str = "127.011.0.1";
        boolean result = str.matches("(127|255).(\\d{1,3}).(\\d{1,3}).(\\d{1,3})");
        System.out.println(result);
        String str1 = "qaz.011.0.1";
        System.out.println(str1.matches("(127|255).(\\d{1,3}).(\\d{1,3}).(\\d{1,3})"));

    }
}
