package parrot;

public class NorwegianBlueParrot implements Parrot{
    private static final int ZERO = 0;
    private static final double MIN_SPEED = 24.0;
    private final boolean isNailed;
    private final double voltage;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.isNailed = isNailed;
        this.voltage = voltage;

    }

    @Override
    public double getSpeed(){
        return (isNailed) ? ZERO : getBaseSpeed();
    }

    private double getBaseSpeed() {
        return Math.min(MIN_SPEED, voltage * BASESPEED);
    }
}
