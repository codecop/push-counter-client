package parrot;

public class NorwegianBlueParrot extends Parrot {

    private final double voltage;
    private final boolean nailed;

    public NorwegianBlueParrot(final double voltage, final boolean isNailed) {
        super(isNailed);
        this.voltage = voltage;
        this.nailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return (nailed) ? 0 : getBaseSpeed(voltage);
    }
}
