package HW4.Shapes;

public class Cylinder extends SolidOfRevolution{
    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    @Override
    public double calcVolume() {
        return Math.PI * radius * height / 3;
    }
}
