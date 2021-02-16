package parrot;

public class Parrot {

    private ParrotTypeEnum type;

    public Parrot(ParrotTypeEnum type) {
        this.type = type;
    }

    public double getSpeed() {
        switch (type) {
            case EUROPEAN:
                return getBaseSpeed();
        }
        return getBaseSpeed();
    }

    protected double getBaseSpeed() {
        return 12.0;
    }

}
