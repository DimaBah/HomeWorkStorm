package MyException;

public class Circle extends Shape{
    @Override
    public double square(double r, double pi) throws UnluckyNumberException{
        if (r == 13) {
            throw new UnluckyNumberException("Won't go with the unlucky number!");
        }
        System.out.print("OK, let's count that... ");
        return r * r * pi;
    }
}
