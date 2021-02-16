package parrot;

public enum ParrotTypeEnum {

	EUROPEAN {
		@Override
		public double getSpeed(double baseSpeed, double loadFactor, int numberOfCoconuts, boolean isNailed) {
			return baseSpeed;
		}
	}, AFRICAN, NORWEGIAN_BLUE;

	public double getSpeed(double baseSpeed, double loadFactor, int numberOfCoconuts, boolean isNailed) {
		throw new RuntimeException("Should be unreachable");
	}

}
