package parrot;

public class NorwegianBlueParrot extends Parrot {

    private static final double MAX_SPEED = 24.0;
    private static final int NAILED_SPEED = 0;
    private final double voltage;
    private final boolean nailed;

    public NorwegianBlueParrot(final double voltage, final boolean nailed) {
        if(voltage<0) {
            throw new UnsupportedOperationException("Voltage cannot be negative");
        }
        this.voltage = voltage;
        this.nailed = nailed;
    }

    @Override
    public double getSpeed() {
        return nailed ? NAILED_SPEED : getNotNailedSpeed();
    }

    private double getNotNailedSpeed() {
        return Math.min(MAX_SPEED, getBaseSpeed());
    }

    private double getBaseSpeed() {
        return voltage * BASE_SPEED;
    }

}
