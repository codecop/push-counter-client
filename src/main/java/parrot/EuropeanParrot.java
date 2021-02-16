package parrot;

public class EuropeanParrot extends Parrot {

    public EuropeanParrot(final int numberOfCoconuts) {
        super(ParrotTypeEnum.EUROPEAN);
    }

    public double getSpeed() {
        return getBaseSpeed();
    }

}
