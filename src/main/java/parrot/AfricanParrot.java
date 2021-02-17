package parrot;

public class AfricanParrot extends Parrot {

    private final int numberCoconuts;

    public AfricanParrot(final int numberOfCoconuts) {
        this.numberCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberCoconuts);
    }
}
