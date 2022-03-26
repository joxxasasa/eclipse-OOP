package oop;

public class Student {
	String ime; // ime studenta
	String prezime; // prezime studenta
	double test1, test2, prosek; // ocene na testovima
	
	
	
	void postaviImePrezime(String i, String p) {
		ime = i;
		prezime = p;
	}

	void postaviPoene(double t1, double t2) {
		test1 = t1;
		test2 = t2;
	}

	void racunajProsek() { // prosek poena
		prosek = (test1 + test2) / 2;
	}

	void stampajPoene() { // stampa rezultata
		System.out.println("Student " + ime + " " + prezime + " - prosecan broj poena: " + prosek);
	}
}