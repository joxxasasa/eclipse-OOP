package oop;

public class TestZaposleni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zaposleni radnik1 = new Zaposleni();
		Zaposleni radnik2 = new Zaposleni();
		Zaposleni radnik3 = new Zaposleni();
		
		radnik1.postaviImePrezime("Petar", "Petrovic");
		radnik1.postaviKoef(2.89);
		radnik1.racunajPlata();
		radnik1.stampajPlata();
		
		radnik2.postaviImePrezime("Nikola", "Nikolic");
		radnik2.postaviKoef(3.75);
		radnik2.racunajPlata();
		radnik2.stampajPlata();
		
		radnik3.postaviImePrezime("Pera", "Detlic");
		radnik3.postaviKoef(3.05);
		radnik3.racunajPlata();
		radnik3.stampajPlata();
		
		Zaposleni treci = new Zaposleni("Sasa", "Jovkovic", 4.5);
		treci.racunajPlata();
		treci.stampajPlata();
	}

}
//URADI SA VISE RADNIKA