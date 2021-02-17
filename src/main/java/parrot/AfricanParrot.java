package parrot;

public class AfricanParrot implements Parrot{
    private static final double LOAD_FACTOR = 9.0;
    private static final int ZERO = 0;
    private final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(ZERO, NumbersEnum.BASESPEED.getValue() - NumbersEnum.LOAD_FACTOR.getValue() * numberOfCoconuts);
    }

}
