package HW4.Degrees;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Conversion from or to Celsius, f or t? ");
        String fromToCel = scan.next();
        if ("f".equals(fromToCel)) {
            boolean toExit = false;
            while (!toExit) {
                System.out.println("Enter Celsius degrees: ");
                double cel = scan.nextDouble();
                System.out.print("Convert to Fahrenheits or Kelvins, f or k? \n" +
                        "or type \"exit\" ");
                String toDegrees = scan.next();
                switch (toDegrees) {
                    case "f":
                        FahrenheitConverter fCon = new FahrenheitConverter();
                        System.out.printf("It is %.2f F\n", fCon.convert(cel));
                        break;
                    case "k":
                        KelvinConverter kCon = new KelvinConverter();
                        System.out.printf("It is %.2f K\n", kCon.convert(cel));
                        break;
                    case "exit":
                        toExit = true;
                        break;
                }

            }
        } else if ("t".equals(fromToCel)){
            System.out.println("Enter some degrees: ");
            double degrees = scan.nextDouble();
            System.out.println("Convert Celsius from Fahrenheits or Kelvins, f or k? ");
            String fromDeg = scan.next();
            CelsiusConverter cCon = new CelsiusConverter();
            System.out.println("It will be " + cCon.convert(degrees, fromDeg) + " Celsius");
        }

    }
}
