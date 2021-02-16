package parrot;

public class NorwegianBlueParrot extends Parrot {

    private double voltage;

    public NorwegianBlueParrot(final ParrotTypeEnum type, final double voltage, final boolean isNailed) {
        super(type, voltage, isNailed);
        this.voltage = voltage;
    }

}
