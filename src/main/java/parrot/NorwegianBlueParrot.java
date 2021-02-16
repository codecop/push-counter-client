package parrot;

public class NorwegianBlueParrot extends Parrot {

    private double voltage;
    private boolean isNailed;

    public NorwegianBlueParrot(final ParrotTypeEnum type, final double voltage, final boolean isNailed) {
        super(type, voltage, isNailed);
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * super.getBaseSpeed());
    }

}
