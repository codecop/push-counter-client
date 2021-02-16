package parrot;

public class EuropeanParrot implements ParrotInt {

    @Override
    public double getSpeed() {
        return 12.0;
    }

    @Override
    public ParrotTypeEnum getType() {
        return ParrotTypeEnum.EUROPEAN;
    }
}
