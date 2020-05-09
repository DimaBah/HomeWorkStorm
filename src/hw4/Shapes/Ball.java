package HW4.Shapes;

public class Ball extends SolidOfRevolution{
    public Ball(double radius) {
        super(radius);
    }
    @Override
    public double calcVolume() {
        return Math.PI * radius * radius * 4 / 3;
    }
}
