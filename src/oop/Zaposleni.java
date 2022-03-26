package oop;

public class Zaposleni {
	String ime;
	String prezime;
	double koefRadnogMesta, plata;
	
	Zaposleni() {}
	
	Zaposleni(String i, String p, double k) {
		ime = i;
		prezime = p;
		koefRadnogMesta = k;
	}
	
	void postaviImePrezime(String i, String p) {
		ime = i;
		prezime = p;
	}

	void postaviKoef(double k) {
		koefRadnogMesta = k;
		
	}

	void racunajPlata() { 
		plata = 2500 * koefRadnogMesta;
	}

	void stampajPlata() { // stampa rezultata
		System.out.println("Radnik " + ime + " " + prezime + " ima platu: " + plata);
	}
}
