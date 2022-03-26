package oopNasledjivanje;

public class Zaposleni extends Osoba{
	private double koefRm;
	private double plata;
	
	Zaposleni() {}
	
	Zaposleni(String ime, String prezime, int starost, double koefRM) {
		super(ime, prezime, starost);
		this.koefRm = koefRM;
		
	}

	public double getKoefRm() {
		return koefRm;
	}

	public void setKoefRm(double koefRm) {
		this.koefRm = koefRm;
	}
	void racunajPlatu(int brDana) {
		plata = brDana * koefRm;
	}
	
	void stampajPlatu() {
		System.out.println("Plata zaposlenog " + getIme() + " " + getPrezime() + ", godina " + getStarost() + " je " + plata);
	}
}
