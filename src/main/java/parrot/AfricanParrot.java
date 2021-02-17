package parrot;

public class AfricanParrot implements Parrot{
    public static final double LOADFACTOR = 9.0;
    private final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, BASESPEED - LOADFACTOR * numberOfCoconuts);
    }

}
