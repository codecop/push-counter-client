package parrot;

public class AfricanParrot extends Parrot {

    private final int numberOfCoconuts;

    public AfricanParrot(final int numberOfCoconuts) {
        super(ParrotTypeEnum.AFRICAN, numberOfCoconuts);
        this.numberOfCoconuts = numberOfCoconuts;
    }
}
