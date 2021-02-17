package parrot;

public class NorwegianParrot extends Parrot {

    private final double voltage;
    private final boolean isNailed;

    public NorwegianParrot(final double voltage,final boolean isNailed) {
        super();
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }

    private double getBaseSpeed(final double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

}
