package parrot;

public class NorwegianParrot extends Parrot {
    public NorwegianParrot(double voltage, boolean isNailed) {
        super(voltage, isNailed);
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }
}
