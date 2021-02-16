package parrot;

public enum ParrotTypeEnum {

	EUROPEAN {
		@Override
		public double getSpeed(double baseSpeed, double loadFactor, double voltage, int numberOfCoconuts, boolean isNailed) {
			return baseSpeed;
		}
	}, AFRICAN {
		@Override
		public double getSpeed(double baseSpeed, double loadFactor, double voltage, int numberOfCoconuts, boolean isNailed) {
			return Math.max(0, baseSpeed - loadFactor * numberOfCoconuts);
		}
	}, NORWEGIAN_BLUE {
		@Override
		public double getSpeed(double baseSpeed, double loadFactor, double voltage, int numberOfCoconuts, boolean isNailed) {
			return (isNailed) ? 0 : Math.min(24.0, voltage * baseSpeed);
		}
	};

	public double getSpeed(double baseSpeed, double loadFactor, double voltage, int numberOfCoconuts, boolean isNailed) {
		throw new RuntimeException("Should be unreachable");
	}

}
