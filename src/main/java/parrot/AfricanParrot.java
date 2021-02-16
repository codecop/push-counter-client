package parrot;

public class AfricanParrot extends Parrot {
    private static final double AFRICAN_LOAD_FACTOR = 9.0;

    private final int numberOfCoconuts;

    public AfricanParrot(final ParrotTypeEnum type, final int numberOfCoconuts) {
        super(type);
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    protected double getBaseSpeed() {
        return Math.max(0, super.getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    private double getLoadFactor() {
        return AFRICAN_LOAD_FACTOR;
    }

}
