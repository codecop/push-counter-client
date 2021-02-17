package parrot;

public class NorwegianBlueParrot extends Parrot {

    private final double parrotVoltage;

    public NorwegianBlueParrot(final double voltage, final boolean isNailed) {
        super(voltage, isNailed);
        this.parrotVoltage = voltage;
    }

    @Override
    public double getSpeed() {
        return (isNailed()) ? 0 : getBaseSpeed(getVoltage());
    }
}
