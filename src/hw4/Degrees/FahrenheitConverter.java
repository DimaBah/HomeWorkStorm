package HW4.Degrees;

public class FahrenheitConverter implements iConverter{
    @Override
    public double convert(double grades){
             return (grades * 9 / 5) + 32;
    }
    @Override
    public double convert(double grades, String fromDeg) {
        System.out.println("Bad conversion :( ");
        return 0;
    }
}
