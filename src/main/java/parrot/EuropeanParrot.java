package parrot;

public class EuropeanParrot extends ParrotInt {

    @Override
    public double getSpeed() {
        return getBaseSpeed();
    }

    @Override
    public ParrotTypeEnum getType() {
        return ParrotTypeEnum.EUROPEAN;
    }
}
