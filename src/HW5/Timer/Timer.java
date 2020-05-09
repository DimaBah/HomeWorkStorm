package HW5.Timer;

public class Timer {
    IEventHandler handler;
    Timer (IEventHandler action){
        this.handler = action;
    }
    public void tenSecGone(){
        handler.execute();
    }
    public static void main(String[] args) {
        System.out.println("Start");
        for (int i = 0; i < 3; i++){
            Timer t = new Timer(new TenSecondsPrinter());
            t.tenSecGone();
        }
        System.out.println("Finish");
    }
}
