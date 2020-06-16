package Ex7;

public enum Computation {

	MULTIPY {
		public double perform(double x, double y) {
			return x * y;
		}
	},
	DIVIDE {
		public double perform(double x, double y) {
			return x / y;
		}
	},
	ADD {
		public double perform(double x, double y) {
			return x + y;
		}
	},
	SUBTRACT {
		public double perform(double x, double y) {
			return x - y;
		}
	};
	
	public abstract double perform(double x, double y);
}
