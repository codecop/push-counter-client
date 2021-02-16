package parrot;

public enum ParrotTypeEnum {

	EUROPEAN {
		@Override
		public double getSpeed(double voltage, int numberOfCoconuts, boolean isNailed) {
			return getBaseSpeed();
		}
	}, AFRICAN {
		@Override
		public double getSpeed(double voltage, int numberOfCoconuts, boolean isNailed) {
			return Math.max(0, getBaseSpeed() - LOAD_FACTOR * numberOfCoconuts);
		}
	}, NORWEGIAN_BLUE {
		@Override
		public double getSpeed(double voltage, int numberOfCoconuts, boolean isNailed) {
			return (isNailed) ? 0 : Math.min(24.0, voltage * getBaseSpeed());
		}
	};

	private static final double LOAD_FACTOR = 9.0;
	private static final double BASE_SPEED = 12.0;

	public double getSpeed(double voltage, int numberOfCoconuts, boolean isNailed) {
		throw new RuntimeException("Should be unreachable");
	}

	protected double getBaseSpeed() {
		return BASE_SPEED;
	}

}
