package parrot;

public class Parrot {

    private final boolean isNailed;

    public Parrot(final double voltage, final boolean isNailed) {
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        throw new RuntimeException("Should be unreachable");
    }

    protected double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    protected double getLoadFactor() {
        return 9.0;
    }

    protected double getBaseSpeed() {
        return 12.0;
    }

    protected boolean isNailed() {
        return isNailed;
    }

}
