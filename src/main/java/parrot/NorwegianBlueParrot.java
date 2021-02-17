package parrot;

public class NorwegianBlueParrot extends Parrot{
    private boolean isNailed;
    private double voltage;

    public NorwegianBlueParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        super(type, numberOfCoconuts, voltage, isNailed);
        this.isNailed = isNailed;
        this.voltage = voltage;
    }

    @Override
    public double getSpeed(){
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }
}
