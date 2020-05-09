package HW4.Shapes;

public class Box extends Shape{
    double a;
    double b;
    double c;
    public Box(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        volume = this.calcVolume();
    }
    @Override
    public double calcVolume() {
        return a * b * c;
    }
    void inbox (double inVolume){
        this.volume -= inVolume;
        System.out.printf("Shape with volume %.2f is added... Remaining volume is %.2f\n", inVolume, this.volume);
    };
    boolean add(Shape shape){
        if (this.volume - shape.calcVolume() >= 0){
            return true;
        }
        else return false;
    };
}
