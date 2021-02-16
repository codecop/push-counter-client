package parrot;

public abstract class Parrot {

    abstract double getSpeed();

    protected double getBaseSpeed() {
        return 12.0;
    }

}
