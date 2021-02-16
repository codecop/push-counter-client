package parrot;

public enum ParrotTypeEnum {

	EUROPEAN {
		@Override
		public double getSpeed(double baseSpeed) {
			return baseSpeed;
		}
	}, AFRICAN, NORWEGIAN_BLUE;

	public double getSpeed(double baseSpeed) {
		throw new RuntimeException("Should be unreachable");
	}

}
