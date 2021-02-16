package parrot;

public class Parrot {

    private ParrotInt parrot;

    private ParrotTypeEnum type;
    private double voltage;
    private boolean isNailed;

    public Parrot(ParrotTypeEnum type, double voltage, boolean isNailed) {
        this.type = type;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public Parrot(ParrotInt parrot) {
        this.parrot = parrot;
        this.type = parrot.getType();
    }

    public double getSpeed() {
        switch (type) {
        case EUROPEAN:
            return parrot.getSpeed();
        case AFRICAN:
            return parrot.getSpeed();
        case NORWEGIAN_BLUE:
            return (isNailed) ? 0 : getBaseSpeed(voltage);
        default:
            throw new RuntimeException("Should be unreachable");
        }
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }


    private double getBaseSpeed() {
        return 12.0;
    }

}
