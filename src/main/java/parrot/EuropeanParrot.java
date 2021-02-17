package parrot;

public class EuropeanParrot extends Parrot {
    public EuropeanParrot() {
    }

    @Override
    public final double getSpeed() {
        return getBaseSpeed();
    }
}
