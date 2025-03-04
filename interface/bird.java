
public abstract class bird implements flyable {

    protected double flyingTimeInHour;
    protected int weight;

    public bird(double flyingTimeInHour, int weight) {
        this.flyingTimeInHour = flyingTimeInHour;
        this.weight = weight;
    }

    
    //public abstract void fly();

    public int getWeight() {
        return weight;
    }

    public double getFlyingTimeInHour() {
        return flyingTimeInHour;
    }

}
