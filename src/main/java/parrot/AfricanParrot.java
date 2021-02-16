package parrot;

public class AfricanParrot extends Parrot {

    private final int numberOfCoconuts;

    public AfricanParrot(final ParrotTypeEnum type, final int numberOfCoconuts, double voltage, boolean isNailed) {
        super(type, isNailed);
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    protected double getBaseSpeed() {
        return Math.max(0, super.getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    private double getLoadFactor() {
        return 9.0;
    }

}
