package parrot;

public abstract class Parrot {

    private ParrotTypeEnum type;

    public Parrot(ParrotTypeEnum type) {
        this.type = type;
    }

    public abstract double getSpeed();


    protected double getLoadFactor() {
        return 9.0;
    }

    protected double getBaseSpeed() {
        return 12.0;
    }

}
