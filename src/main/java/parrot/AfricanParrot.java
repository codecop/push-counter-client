package parrot;

public class AfricanParrot extends Parrot {

    public AfricanParrot(final int numberOfCoconuts, final double voltage, final boolean isNailed) {
        super(numberOfCoconuts, voltage, isNailed);
    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * getNumberOfCoconuts());
    }
}
