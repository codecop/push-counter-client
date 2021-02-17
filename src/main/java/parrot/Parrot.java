package parrot;

public abstract class Parrot {

    public abstract double getSpeed();

    protected double getLoadFactor() {
        return 9.0;
    }

    protected double getBaseSpeed() {
        return 12.0;
    }

}
