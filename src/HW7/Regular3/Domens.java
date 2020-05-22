package HW7.Regular3;

public class Domens {
    public static void main(String[] args) {
        String str = "https://somesite.org/";
        boolean result = str.matches("^http(s?)://([a-zA-Z0-9]([a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9])?\\.)+[a-zA-Z]{2,3}/$");
        System.out.println(result);
        String str1 = "http://somesite.org/";
        System.out.println(str1.matches("^http(s?)://([a-zA-Z0-9]([a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9])?\\.)+[a-zA-Z]{2,3}/$"));
        String str2 = "somesite.org/";
        System.out.println(str2.matches("^http(s?)://([a-zA-Z0-9]([a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9])?\\.)+[a-zA-Z]{2,3}/$"));
    }
}
