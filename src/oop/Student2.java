package oop;

public class Student2 {
	String ime; // ime studenta
	String prezime; // prezime studenta
	double test1, test2, prosek; // ocene na testovima
	
	Student2() {}
	
	Student2(String i, String p, double t1, double t2){
		ime = i;
		prezime = p;
		test1 = t1;
		test2 = t2;
	}
	
	void pribaviIme(String i) {
		ime = i;
		
	}
	
	void pribaviPrezime(String p) {
		prezime = p;
	}
	
	void racunajProsek() {
		prosek = (test1 + test2) / 2;
	}
	
	void stampajRezultat() {
		System.out.println("Rezultat studenta " + ime + prezime + " je " + prosek);
	}
}
