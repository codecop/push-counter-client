package parrot;

public class AfricanParrot extends Parrot {

    private static final double LOAD_FACTOR = 9.0;
    private static final int MIN_SPEED = 0;
    private final int numberOfCoconuts;

    public AfricanParrot(final int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(MIN_SPEED, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
    }

}
