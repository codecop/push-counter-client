package parrot;

public class Parrot {

	private final ParrotTypeEnum type;
	private final int numberOfCoconuts;
	private final double voltage;
	private final boolean isNailed;

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
