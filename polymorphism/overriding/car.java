
public class car extends vehicle {

    @Override
    public void start() {
        super.start();
        System.out.println("car engine is starting....");
    }

    public static void main(String[] args) {
        car c = new car();
        c.start();
    }
}
