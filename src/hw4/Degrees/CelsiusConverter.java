package HW4.Degrees;

public class CelsiusConverter implements IConverter {
    @Override
    public double convert(double value){
        return 0;
    }
    public double convert(double grades, String fromDeg) {
        if ("f".equals(fromDeg)){
            return (grades - 32) * 5 /9;
        }
        else if ("k".equals(fromDeg)) {
            return grades - 273.15;
        }
        else
            System.out.println("Bad parametr");
        return 0;
    }
}
