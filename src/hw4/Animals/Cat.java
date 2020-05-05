package HW4.Animals;

public class Cat extends CatsFamily implements ICanRun, ICanBeEaten, ICanEat {
    String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    protected void toYell() {
        System.out.println("Miaaaaoow!");
    }

    @Override
    public void run() {
        System.out.println("I run fast & jump high!");
    }

    @Override
    public void canBeEaten() {
        System.out.println("Dont eat me, I gonna fight!");
    }

    @Override
    public void canEat() {
        System.out.println("Where is my liitle mouse?");
    }
}
