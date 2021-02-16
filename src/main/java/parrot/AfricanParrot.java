package parrot;

public class AfricanParrot extends Parrot {

    private static final int AFRICAN_BASE_SPEED = 0;
    private static final double AFRICAN_LOAD_FACTOR = 9.0;

    private final int numberOfCoconuts;

    public AfricanParrot(final int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed();
    }

    @Override
    public double getBaseSpeed() {
        return Math.max(AFRICAN_BASE_SPEED, substractAfricanFactorFromBaseSpeed());
    }

    private double substractAfricanFactorFromBaseSpeed() {
        return super.getBaseSpeed() - countAfricanLoadFactorWithCoconuts();
    }

    private double countAfricanLoadFactorWithCoconuts() {
        return AFRICAN_LOAD_FACTOR * numberOfCoconuts;
    }

}
