package parrot;

public abstract class ParrotInt {

    abstract double getSpeed();

    abstract ParrotTypeEnum getType();

    protected double getBaseSpeed() {
        return 12.0;
    }
}
