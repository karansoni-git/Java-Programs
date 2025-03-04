//this program generate a number between 1-6 like dice.

public class DiceRoll {

    public static void main(String[] args) {
        double dice = Math.random() * 6;
        int fr = (int) Math.ceil(dice);
        System.out.println("number is : " + fr);
    }
}
