package parrot;

public class NorwegianBlueParrot extends Parrot {

    private final double voltage;

    public NorwegianBlueParrot(final double voltage, final boolean isNailed) {
        super(isNailed);
        this.voltage = voltage;
    }

    @Override
    public double getSpeed() {
        return (isNailed()) ? 0 : getBaseSpeed(voltage);
    }
}
