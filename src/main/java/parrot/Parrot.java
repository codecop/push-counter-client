package parrot;

public class Parrot {

    private final int numberOfCoconuts;
    private double voltage;
    private boolean isNailed;

    public Parrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
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

    protected int getNumberOfCoconuts() {
        return numberOfCoconuts;
    }

    protected boolean isNailed() {
        return isNailed;
    }

    protected double getVoltage() {
        return voltage;
    }
}
