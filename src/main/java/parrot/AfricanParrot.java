package parrot;

public class AfricanParrot extends ParrotInt {

    private final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    @Override
    public ParrotTypeEnum getType() {
        return ParrotTypeEnum.AFRICAN;
    }

    private double getLoadFactor() {
        return 9.0;
    }
}
