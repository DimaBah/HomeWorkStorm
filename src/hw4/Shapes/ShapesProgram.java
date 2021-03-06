package HW4.Shapes;

import java.util.Scanner;

public class ShapesProgram {
    public static void main(String[] args) {
        Box box = new Box(2, 1, 1);
        System.out.println("V= " + box.getVolume());
        Scanner scan = new Scanner(System.in);
        System.out.print("--- Hello! ");
        boolean toExit = false;
        while (!toExit) {
            System.out.println("--- Select a shape to add to the box:\n" +
                    "Pyramid - 1\n" +
                    "Cylinder - 2\n" +
                    "Ball - 3\n" +
                    "Or exit the program - 4\n" +
                    "Your choice is: ");
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    double s = (Math.random() + 0.1);
                    double hPyr = (Math.random() + 0.1);
                    Pyramid pyr = new Pyramid(s, hPyr);
                    if (box.add(pyr)) {
                        System.out.printf("This pyramid has a S = %.2f and Height = %.2f\n", s, hPyr);
                        box.inbox(pyr.calcVolume());
                    } else System.out.println("Impossible to add a new shape :( ");
                    break;
                case 2:
                    double rCyl = (Math.random() + 0.1);
                    double hCyl = (Math.random() + 0.1);
                    Cylinder cyl = new Cylinder(rCyl, hCyl);
                    if (box.add(cyl)) {
                        System.out.printf("This cylinder has a Radius = %.2f and Height = %.2f\n", rCyl, hCyl);
                        box.inbox(cyl.calcVolume());
                    } else System.out.println("Impossible to add a new shape :( ");
                    break;
                case 3:
                    double rBall = (Math.random() + 0.1);
                    Ball ball = new Ball(rBall);
                    if (box.add(ball)) {
                        System.out.printf("This ball has a Radius = %.2f \n", rBall);
                        box.inbox(ball.calcVolume());
                    } else System.out.println("Impossible to add a new shape :( ");
                    break;
                case 4:
                    System.out.println("Bye!");
                    toExit = true;
                    break;
                default:
                    System.out.println("Try again now........");
                    break;
            }
        }
    }
}
