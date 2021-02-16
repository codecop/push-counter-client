package parrot;

public enum ParrotTypeEnum {

	EUROPEAN {
		@Override
		public double getSpeed(double baseSpeed, double loadFactor) {
			return baseSpeed;
		}
	}, AFRICAN, NORWEGIAN_BLUE;

	public double getSpeed(double baseSpeed, double loadFactor) {
		throw new RuntimeException("Should be unreachable");
	}

}
