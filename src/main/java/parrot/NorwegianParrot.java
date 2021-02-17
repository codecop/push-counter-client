package parrot;

public class NorwegianParrot extends Parrot {

    private static final double MAX_SPEED = 24.0;
    private static final int NAILED_SPEED = 0;
    private final double voltage;
    private final boolean nailed;

    public NorwegianParrot(final double voltage, final boolean nailed) {
        this.voltage = voltage;
        this.nailed = nailed;
    }

    @Override
    public double getSpeed() {
        return nailed ? NAILED_SPEED : getNotNailedSpeed();
    }

    private double getNotNailedSpeed() {
        return Math.min(MAX_SPEED, voltage * BASE_SPEED);
    }

}
