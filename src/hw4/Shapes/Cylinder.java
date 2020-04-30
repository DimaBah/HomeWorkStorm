package HW4.Shapes;

public class Cylinder extends SolidOfRevolution{
    double height;
    public Cylinder(double r, double h) {
        this.radius = r;
        this.height = h;
        this.volume = this.calcVolume(r, h);
    }
    @Override
    public double calcVolume(double r, double h) {
        return Math.PI * r * h / 3;
    }
}
