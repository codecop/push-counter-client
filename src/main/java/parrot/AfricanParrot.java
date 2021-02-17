package parrot;

public class AfricanParrot extends Parrot{
    public static final double LOADFACTOR = 9.0;
    private int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, BASESPEED - getLoadFactor() * numberOfCoconuts);
    }

    protected double getLoadFactor() {
        return LOADFACTOR;
    }

}
