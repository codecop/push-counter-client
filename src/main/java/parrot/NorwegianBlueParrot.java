package parrot;

public class NorwegianBlueParrot extends Parrot {
    public NorwegianBlueParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(numberOfCoconuts, voltage, isNailed);
    }

    @Override
    public double getSpeed() {
        return (isNailed()) ? 0 : getBaseSpeed(getVoltage());
    }
}
