package parrot;

public class Parrot {

    private final ParrotTypeEnum type;

    public Parrot(ParrotTypeEnum type) {
        this.type = type;
    }

    public double getSpeed() {
        return getBaseSpeed();
    }

    protected double getBaseSpeed() {
        return 12.0;
    }

}
