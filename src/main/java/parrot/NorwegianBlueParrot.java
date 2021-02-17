package parrot;

public class NorwegianBlueParrot implements Parrot{
    private final boolean isNailed;
    private final double voltage;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.isNailed = isNailed;
        this.voltage = voltage;

    }

    @Override
    public double getSpeed(){
        return (isNailed) ? NumbersEnum.ZERO.getValue() : getBaseSpeed();
    }

    private double getBaseSpeed() {
        return Math.min(NumbersEnum.MIN_SPEED.getValue(), voltage * NumbersEnum.BASESPEED.getValue());
    }
}
