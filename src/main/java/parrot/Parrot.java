package parrot;

public class Parrot {

	private ParrotTypeEnum type;
	private int numberOfCoconuts;
	private double voltage;
	private boolean isNailed;

	public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
		this.type = type;
		this.numberOfCoconuts = numberOfCoconuts;
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	public double getSpeed() {
		return type.getSpeed(voltage, numberOfCoconuts, isNailed);
	}

}
