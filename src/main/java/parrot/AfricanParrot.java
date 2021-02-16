package parrot;

public class AfricanParrot implements ParrotInt {

    private final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return 12.0;
    }

    @Override
    public ParrotTypeEnum getType() {
        return ParrotTypeEnum.AFRICAN;
    }
}
