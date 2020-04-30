package HW4.Shapes;

public class Box extends Shape{
    @Override
    public double calcVolume(double s, double h) {
        return s * h;
    }
    Box(){
        this.volume = this.calcVolume(1,1);
    }
    void inbox (double inVolume){
        this.volume = this.volume - inVolume;
        System.out.printf("Shape with volume %.2f is added... Remaining volume is %.2f\n", inVolume, this.volume);
    };
    boolean add(Shape shape){
        if (this.volume - shape.getVolume() >= 0){
            return true;
        }
        else return false;
    };
}
