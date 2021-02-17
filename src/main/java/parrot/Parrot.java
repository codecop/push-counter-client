package parrot;

public abstract class  Parrot {

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

    public abstract double getSpeed();
//        switch (type) {
//        case EUROPEAN:
//            return getBaseSpeed();
//        case AFRICAN:
//            return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
//        case NORWEGIAN_BLUE:
//            return (isNailed) ? 0 : getBaseSpeed(voltage);
//        default:
//            throw new RuntimeException("Should be unreachable");
//        }


    protected double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    protected double getLoadFactor() {
        return 9.0;
    }

    protected double getBaseSpeed() {
        return 12.0;
    }

}
