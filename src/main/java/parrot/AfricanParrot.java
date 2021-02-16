package parrot;

public class AfricanParrot extends Parrot {

    private final int numberOfCoconuts;

    public AfricanParrot(final int numberOfCoconuts, final double voltage, final boolean isNailed) {
        super(ParrotTypeEnum.AFRICAN, numberOfCoconuts);
        this.numberOfCoconuts = numberOfCoconuts;
    }
}
