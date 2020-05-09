package MyException;

public class Rectangle extends Shape{
    @Override
    public double square(double a, double b) throws UnluckyNumberException{
        if (a == 13 || b == 13) {
            throw new UnluckyNumberException("Won't go with the unlucky number!");
        }
        System.out.print("OK, let's count that... ");
        return a * b;
    }
}
