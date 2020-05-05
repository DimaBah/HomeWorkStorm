package HW4.Shapes;

public class Pyramid extends Shape{
    double s;
    double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }
    @Override
    public double calcVolume() {
        return s * h / 3;
    }


}
