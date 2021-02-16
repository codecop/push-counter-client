package parrot;

public class AfricanParrot extends Parrot {

    private final int numberOfCoconuts;

    public AfricanParrot(final int numberOfCoconuts) {
        super(ParrotTypeEnum.AFRICAN);
        this.numberOfCoconuts = numberOfCoconuts;
    }

    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

}
