package parrot;

public class NorwegianBlueParrot extends Parrot {

    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlueParrot(final double voltage, final boolean isNailed) {
        super();
        this.isNailed = isNailed;
        this.voltage = voltage;
    }

    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed();
    }

    protected double getBaseSpeed() {
        return Math.min(24.0, voltage * BASE_SPEED);
    }

}
