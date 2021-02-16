package parrot;

public class Parrot {

    private ParrotTypeEnum type;
    protected int numberOfCoconuts;
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
            case EUROPEAN:
                return getBaseSpeed();
            case AFRICAN:
                return getBaseSpeed();
            case NORWEGIAN_BLUE:
                return norwegianMethod();
            default:
                throw new RuntimeException("Should be unreachable");
        }
    }

    protected double getBaseSpeed() {
        return 12.0;
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }


    private double norwegianMethod() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }




}
