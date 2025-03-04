
public class eagle extends bird {

    public eagle(double flyingTimeInHour, int weight) {
        super(flyingTimeInHour, weight);
    }

    @Override
    public void fly() {
        System.out.println("Eagle can fly " + flyingTimeInHour + " Hour with its weight " + weight + " gram");
    }

    public static void main(String[] args) {
        //can not create object of abstract class.
        // bird b1 = new bird(2.3,430);
        eagle e1 = new eagle(2.4, 350);
        e1.fly();
        System.out.println(e1.getFlyingTimeInHour());
        System.out.println(e1.getWeight());
    }
}
