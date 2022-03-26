package oopNasledjivanje;

public class Student extends Osoba{
	private String brojIndeksa;
	private double test1;
	private double test2;
	double prosek;
	
	Student() {}
	
	Student(String ime, String prezime, int starost, String brojIndeksa, double test1, double test2) {
		super(ime, prezime, starost);
		this.brojIndeksa = brojIndeksa;
		this.test1 = test1;
		this.test2 = test2;
		
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public double getTest1() {
		return test1;
	}

	public void setTest1(double test1) {
		this.test1 = test1;
	}

	public double getTest2() {
		return test2;
	}

	public void setTest2(double test2) {
		this.test2 = test2;
	}
	
	public void racunajPoene() {
		prosek = (test1 + test2) / 2;
	}
	
	public void stampajPoene() {
		System.out.println("Student " + getIme() + " " + getPrezime() + " ima prosek od " + prosek + " poena.");
	}
}
