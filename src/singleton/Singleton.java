package singleton;

public class Singleton {
	private static Singleton instanca = null;
		public String s;
	protected Singleton() {
		// Postoji samo kako bi sprecili instanciranje
		this.s = "Pozdrav od stringa koji je deo Singleton Klase!";
	}

	public static Singleton pribaviInstancu() {
		if (instanca == null) {
			instanca = new Singleton();
		}
		return instanca;
	}
	void stampajS() {
		System.out.println(s);
	}
	
}
