package parrot;

public enum NumbersEnum {
    BASESPEED(12),
    LOAD_FACTOR(9),
    ZERO(0);

    double value;

    NumbersEnum(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

