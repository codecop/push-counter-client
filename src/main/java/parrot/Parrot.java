package parrot;

public class Parrot {

    private ParrotInt parrot;


    public Parrot(ParrotInt parrot) {
        this.parrot = parrot;
    }

    public double getSpeed() {
        return parrot.getSpeed();
    }
}
