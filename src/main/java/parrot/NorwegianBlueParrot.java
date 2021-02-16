package parrot;

public class NorwegianBlueParrot extends Parrot {

    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlueParrot(final int numberOfCoconuts, final double voltage, final boolean isNailed) {
        super(ParrotTypeEnum.NORWEGIAN_BLUE);
        this.isNailed = isNailed;
        this.voltage = voltage;
    }

    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed();
    }

    protected double getBaseSpeed() {
        return Math.min(24.0, voltage * super.getBaseSpeed());
    }

}
