package parrot;

public class Parrot {

    private ParrotTypeEnum type;

    public Parrot(ParrotTypeEnum type, double voltage, boolean isNailed) {
        this.type = type;
    }

    public double getSpeed() {
        switch (type) {
            case EUROPEAN:
                return getBaseSpeed();
            case AFRICAN:
                return getBaseSpeed();
            case NORWEGIAN_BLUE:
                return getBaseSpeed();
            default:
                throw new RuntimeException("Should be unreachable");
        }
    }

    protected double getBaseSpeed() {
        return 12.0;
    }

}
