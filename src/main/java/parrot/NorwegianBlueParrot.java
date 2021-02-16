package parrot;

public class NorwegianBlueParrot extends Parrot {
    private static final int NORWEGIAN_BASE = 0;
    private static final double SPEED = 24.0;
    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlueParrot(final double voltage, final boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed();
    }

    @Override
    public double getBaseSpeed() {
        return isNailed ? NORWEGIAN_BASE : getBaseSpeed(voltage);
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(SPEED, countVoltage(voltage));
    }

    private double countVoltage(final double voltage) {
        return voltage * super.getBaseSpeed();
    }

}
