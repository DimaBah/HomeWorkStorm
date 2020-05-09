package HW4.Degrees;

public class FahrenheitConverter implements IConverter {
    @Override
    public double convert(double grades){
        return (grades * 9 / 5) + 32;
    }
    //   @Override
//    public void convert(double grades, String fromDeg) {
//        System.out.println("Bad conversion :( ");
//        return 0;
//    }
}
