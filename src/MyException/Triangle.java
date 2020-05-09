package MyException;

public class Triangle extends Shape{
    @Override
    public double square(double a, double h) throws UnluckyNumberException{
        if (a == 13 || h == 13) {
            throw new UnluckyNumberException("Won't go with the unlucky number!");
        }
        System.out.print("OK, let's count that... ");
        return a * h /2;
    }
}
