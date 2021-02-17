package parrot;

public class AfricanParrot implements Parrot{
    private final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(NumbersEnum.ZERO.getValue(), NumbersEnum.BASESPEED.getValue() - NumbersEnum.LOAD_FACTOR.getValue() * numberOfCoconuts);
    }

}
