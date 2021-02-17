package parrot;

public class AfricanParrot implements Parrot{
    private static final double LOAD_FACTOR = 9.0;
    private final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, BASESPEED - LOAD_FACTOR * numberOfCoconuts);
    }

}
