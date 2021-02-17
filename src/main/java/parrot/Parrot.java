package parrot;

public abstract class  Parrot {
    public static final double BASESPEED = 12.0;

    public Parrot() {
    }

    public abstract double getSpeed();

    protected double getBaseSpeed() {
        return BASESPEED;
    }

}
