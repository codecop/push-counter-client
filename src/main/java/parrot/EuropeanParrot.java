package parrot;

public class EuropeanParrot extends Parrot{

    public EuropeanParrot(double voltage, boolean isNailed) {
        super();
    }

    @Override
    public double getSpeed() {
        return super.getBaseSpeed();
    }
}
