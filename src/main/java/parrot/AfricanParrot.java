package parrot;

public class AfricanParrot extends Parrot{

    public AfricanParrot(final ParrotTypeEnum type, final int numberOfCoconuts, final double voltage, final boolean isNailed) {
        super(type, numberOfCoconuts, voltage, isNailed);
    }

    @Override
    protected double getBaseSpeed() {
        return Math.max(0, super.getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    private double getLoadFactor() {
        return 9.0;
    }

}
