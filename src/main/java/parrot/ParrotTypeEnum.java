package parrot;

public enum ParrotTypeEnum {

	EUROPEAN {
		@Override
		public double getSpeed(double baseSpeed, double loadFactor, double voltage, int numberOfCoconuts, boolean isNailed) {
			return this.getBaseSpeed();
		}
	}, AFRICAN {
		@Override
		public double getSpeed(double baseSpeed, double loadFactor, double voltage, int numberOfCoconuts, boolean isNailed) {
			return Math.max(0, this.getBaseSpeed() - loadFactor * numberOfCoconuts);
		}
	}, NORWEGIAN_BLUE {
		@Override
		public double getSpeed(double baseSpeed, double loadFactor, double voltage, int numberOfCoconuts, boolean isNailed) {
			return (isNailed) ? 0 : Math.min(24.0, voltage * this.getBaseSpeed());
		}
	};

	public double getSpeed(double baseSpeed, double loadFactor, double voltage, int numberOfCoconuts, boolean isNailed) {
		throw new RuntimeException("Should be unreachable");
	}

	protected double getLoadFactor() {
		return 9.0;
	}

	protected double getBaseSpeed() {
		return 12.0;
	}

}
