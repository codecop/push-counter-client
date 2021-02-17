package parrot;

public enum NumbersEnum {
    BASESPEED(12);

    double value;

    NumbersEnum(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

