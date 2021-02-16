package parrot;

public class AfricanParrot implements ParrotInt {

    @Override
    public double getSpeed() {
        return 12.0;
    }

    @Override
    public ParrotTypeEnum getType() {
        return ParrotTypeEnum.AFRICAN;
    }
}
