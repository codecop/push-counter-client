package parrot;

public class Parrot {

    public Parrot(ParrotTypeEnum type) {
    }

    public double getSpeed() {
        return getBaseSpeed();
    }

    protected double getBaseSpeed() {
        return 12.0;
    }

}
