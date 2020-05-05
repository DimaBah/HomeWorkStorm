package HW4.Degrees;

public class KelvinConverter implements IConverter {
    @Override
    public double convert(double grades) {
        return grades + 273.15;
    }
//    @Override
//    public double convert(double grades, String fromDeg) {
//        System.out.println("Bad conversion :( ");
//        return 0;
//    }
}
