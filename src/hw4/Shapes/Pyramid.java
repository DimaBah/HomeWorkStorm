package HW4.Shapes;

public class Pyramid extends Shape{
    double s;
    double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
        this.volume = this.calcVolume(s, h);
    }
    @Override
    public double calcVolume(double s, double h) {
        return s * h / 3;
    }


}
