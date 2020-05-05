package HW4.Animals;

public class Dog extends AllEating implements ICanRun, ICanEat {
    String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    protected void toYell() {
        System.out.println("Waaaaf - waaaf!");
    }

    @Override
    public void run() {
        System.out.println("I drive the prey!");
    }

    @Override
    public void canEat() {
        System.out.println("Where is my meat?");
    }
}
