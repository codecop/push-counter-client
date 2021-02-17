package parrot;

public class NorwegianBlueParrot extends Parrot {
    public NorwegianBlueParrot(final double voltage, final boolean isNailed) {
        super(voltage, isNailed);
    }

    @Override
    public double getSpeed() {
        return (isNailed()) ? 0 : getBaseSpeed(getVoltage());
    }
}
