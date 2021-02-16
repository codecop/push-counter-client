package parrot;

public class NorwegianBlueParrot extends ParrotInt {

    private double voltage;
    private boolean isNailed;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return 0;
    }

    @Override
    public ParrotTypeEnum getType() {
        return ParrotTypeEnum.NORWEGIAN_BLUE;
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }
}
