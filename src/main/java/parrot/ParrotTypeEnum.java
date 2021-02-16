package parrot;

public enum ParrotTypeEnum {

	EUROPEAN {
		@Override
		public double getSpeed(double voltage, int numberOfCoconuts, boolean isNailed) {
			return BASE_SPEED;
		}
	}, AFRICAN {
		@Override
		public double getSpeed(double voltage, int numberOfCoconuts, boolean isNailed) {
			return Math.max(0, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
		}
	}, NORWEGIAN_BLUE {
		@Override
		public double getSpeed(double voltage, int numberOfCoconuts, boolean isNailed) {
			return (isNailed) ? 0 : Math.min(24.0, voltage * BASE_SPEED);
		}
	};

	private static final double LOAD_FACTOR = 9.0;
	private static final double BASE_SPEED = 12.0;

	public abstract double getSpeed(double voltage, int numberOfCoconuts, boolean isNailed);

}
