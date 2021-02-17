package parrot;

public class NorwegianBlueParrot extends Parrot {

    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlueParrot(final double voltage, final boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public final double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }
}
