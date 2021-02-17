package parrot;

public class NorwegianBlueParrot extends Parrot {
    public NorwegianBlueParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        super(type, numberOfCoconuts, voltage, isNailed);
    }

    @Override
    public double getSpeed() {
        return (isNailed()) ? 0 : getBaseSpeed(getVoltage());
    }
}
