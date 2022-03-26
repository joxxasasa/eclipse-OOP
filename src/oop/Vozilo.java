package oop;

public class Vozilo {
	String marka, tip, registracija;
	int godiste, maxBrzina, snaga;
	double cena;
	
	Vozilo() {}
	
	Vozilo(String marka, String tip, int godiste, String registracija, int maxBrzina, int snaga) {
		this.marka = marka;
		this.tip = tip;
		this.godiste = godiste;
		this.registracija = registracija;
		this.maxBrzina = maxBrzina;
		this.snaga = snaga;
	}
	
	void postaviPodatke(String marka, String tip, int godiste, String registracija, int maxBrzina, int snaga) {
		this.marka = marka;
		this.tip = tip;
		this.godiste = godiste;
		this.registracija = registracija;
		this.maxBrzina = maxBrzina;
		this.snaga = snaga;
	}

		void racunajVrednost() { 
			cena = maxBrzina * snaga / (2021 - godiste);
			
	}
	
		void poredjenjeVrednosti() {
			
			
		}

	void stampajPodatke() { // stampa rezultata
		System.out.println("Marka: " + marka + " Tip: " + tip + " Godiste: " + godiste + " Registracija: " + registracija + " Max brzina: " + maxBrzina + " Snaga: " + snaga + " Vrednost: " + cena);
		System.out.println("_______________________________________________________________________________________________________");
	}
}
