package parrot;

public abstract class Parrot {

    private ParrotTypeEnum type;
    private int numberOfCoconuts;

    public Parrot(ParrotTypeEnum type, int numberOfCoconuts) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
    }

    public abstract double getSpeed();


    protected double getLoadFactor() {
        return 9.0;
    }

    protected double getBaseSpeed() {
        return 12.0;
    }

}
