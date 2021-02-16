package parrot;

public class Parrot {

    private ParrotInt parrot;

    private ParrotTypeEnum type;


    public Parrot(ParrotInt parrot) {
        this.parrot = parrot;
        this.type = parrot.getType();
    }

    public double getSpeed() {
        return parrot.getSpeed();
    }
}
