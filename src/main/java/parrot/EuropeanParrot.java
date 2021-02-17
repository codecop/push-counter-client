package parrot;

public class EuropeanParrot extends Parrot {
    public EuropeanParrot(final int numberOfCoconuts, final double voltage, final boolean isNailed) {
        super(numberOfCoconuts, voltage, isNailed);
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed();
    }
}
