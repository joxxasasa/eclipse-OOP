package izuzeci;

public class Izuzetak {

	public static void main(String[] args) {
		double a = 1.2, b = 2.2, c = 3.1, d;
		int i;
		//@SuppressWarnings({"unused"})
		try {
			d = koren(a, b, c);
			System.out.println("Koren je:" + d);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	static public double koren(double A, double B, double C) throws IllegalArgumentException {
		if (A == 0) {
			throw new IllegalArgumentException("A ne moze biti nula!");
		} else {
			double disk = B * B - 4 * A * C;
			if (disk < 0)
				throw new IllegalArgumentException("Diskriminanta manja od nule!");
			return (-B + Math.sqrt(disk)) / (2 * A);
		}
	}

}
