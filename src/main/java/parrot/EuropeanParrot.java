package parrot;

public class EuropeanParrot extends Parrot {
    public EuropeanParrot(final boolean isNailed) {
        super(isNailed);
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed();
    }
}
