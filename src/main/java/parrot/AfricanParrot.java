package parrot;

public class AfricanParrot extends Parrot {

    private final int numberCoconuts;

    public AfricanParrot(final int numberOfCoconuts, final double voltage, final boolean isNailed) {
        super(numberOfCoconuts, voltage, isNailed);
        this.numberCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * getNumberOfCoconuts());
    }
}
