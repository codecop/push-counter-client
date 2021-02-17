package parrot;

public class EuropeanParrot extends Parrot{

    public EuropeanParrot(double voltage, boolean isNailed) {
        super(voltage, isNailed);
    }

    @Override
    public double getSpeed() {
        return super.getBaseSpeed();
    }
}
