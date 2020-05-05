package HW5.Timer;

public class TenSecondsPrinter implements IEventHandler{
    @Override
    public void execute() {
        try {
            Thread.sleep(10_000);
            System.out.println("10 seconds is gone!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
