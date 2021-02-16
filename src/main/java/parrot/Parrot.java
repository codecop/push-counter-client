package parrot;

public class Parrot {

    private ParrotInt parrot;

    private ParrotTypeEnum type;
    private boolean isNailed;

    public Parrot(ParrotTypeEnum type, double voltage, boolean isNailed) {
        this.type = type;
        this.isNailed = isNailed;
    }

    public Parrot(ParrotInt parrot) {
        this.parrot = parrot;
        this.type = parrot.getType();
    }

    public double getSpeed() {
        switch (type) {
        case EUROPEAN:
        case AFRICAN:
        case NORWEGIAN_BLUE:
            return parrot.getSpeed();
        default:
            throw new RuntimeException("Should be unreachable");
        }
    }
}
