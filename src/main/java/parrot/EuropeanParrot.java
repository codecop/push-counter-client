package parrot;

public class EuropeanParrot implements Parrot{

    @Override
    public double getSpeed(){
        return NumbersEnum.BASESPEED.getValue();
    }
}
