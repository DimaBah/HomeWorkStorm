package HW4.Shapes;

public class Ball extends SolidOfRevolution{
    public Ball(double r) {
        this.radius = r;
        this.volume = this.calcVolume(r);
    }
    @Override
    public double calcVolume(double r) {
        return Math.PI * r * r * 4 / 3;
    }
}
