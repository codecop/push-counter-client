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
			return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
		}
	}, NORWEGIAN_BLUE {
		@Override
		public double getSpeed(double voltage, int numberOfCoconuts, boolean isNailed) {
			return (isNailed) ? 0 : Math.min(24.0, voltage * getBaseSpeed());
		}
	};

	public double getSpeed(double voltage, int numberOfCoconuts, boolean isNailed) {
		throw new RuntimeException("Should be unreachable");
	}

	protected double getLoadFactor() {
		return 9.0;
	}

	protected double getBaseSpeed() {
		return 12.0;
	}

}
