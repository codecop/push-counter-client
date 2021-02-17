package parrot;

public class NorwegianParrot extends Parrot {

    protected double voltage;
    protected boolean isNailed;

    public NorwegianParrot(double voltage, boolean isNailed) {
        super(voltage, isNailed);
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }
}
