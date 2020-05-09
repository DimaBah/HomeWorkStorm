package HW4.Animals;

public class Mouse extends PlantsEating implements ICanRun, ICanBeEaten {
    boolean isPet;

    public boolean isPet() {
        return isPet;
    }

    public void setPet(boolean pet) {
        isPet = pet;
    }

    @Override
    protected void toYell() {
        System.out.println("Pi - pi - pi!");
    }

    @Override
    public void run() {
        System.out.println("I run quietly!");
    }

    @Override
    public void canBeEaten() {
        System.out.println("Dont eat me!");
    }
}
