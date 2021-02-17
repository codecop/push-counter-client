package parrot;

public class AfricanParrot extends Parrot {

    public AfricanParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        super(type, numberOfCoconuts, voltage, isNailed);
    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * getNumberOfCoconuts());
    }
}
