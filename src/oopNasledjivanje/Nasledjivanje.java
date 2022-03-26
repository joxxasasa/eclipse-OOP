package oopNasledjivanje;

public class Nasledjivanje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zaposleni z1 = new Zaposleni("Milan", "Milenkovic", 35, 10.5);
		Zaposleni z2 = new Zaposleni("Marko", "Zivanovic", 41, 12.3);
		
		Student s1 = new Student("Zoran", "Petrovic", 21, "123/20", 78, 86);
		Student s2 = new Student("Milan", "Petkovic", 22, "172/20", 62, 91);
		
		Klijent k1 = new Klijent("Djordje", "Djordjevic", 54, "Komercijalna banka", "123456789", 55000);
		Klijent k2 = new Klijent("Petar", "Petrovic", 32, "Postanska stedionica", "987654321", 78000);
		
		
		
		z1.racunajPlatu(22);
		z1.stampajPlatu();
		
		z2.racunajPlatu(23);
		z2.stampajPlatu();
		/*
		s1.racunajPoene();
		s1.stampajPoene();
		
		s2.racunajPoene();
		s2.stampajPoene();
		*/
		/*
		static void transferNovca(double iznos) {
			k1.umanjenjeSalda(3750);
			k2.uvecanjesalda(3750);
		}
		*/
		
	}

}
