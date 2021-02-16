package parrot;

public class Parrot {

    private ParrotTypeEnum type;
    private int numberOfCoconuts;
    private double voltage;
    private boolean isNailed;

    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        switch (type) {
        case NORWEGIAN_BLUE:
            return (isNailed) ? 0 : Math.min(24.0, voltage * getBaseSpeed());
        default:
            return type.getSpeed(getBaseSpeed(), getLoadFactor(), numberOfCoconuts, isNailed);
        }
    }

    private double getLoadFactor() {
        return 9.0;
    }

    private double getBaseSpeed() {
        return 12.0;
    }

}
