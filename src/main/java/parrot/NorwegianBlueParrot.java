package parrot;

public class NorwegianBlueParrot extends ParrotInt {

    private final int numberOfCoconuts;

    public NorwegianBlueParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    @Override
    public ParrotTypeEnum getType() {
        return ParrotTypeEnum.NORWEGIAN_BLUE;
    }

    private double getLoadFactor() {
        return 9.0;
    }
}
