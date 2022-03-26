package elektronskoPoslovanje;

public class Osoba {
	protected String ime;
	protected String prezime;
	protected int starost;
	protected String jmbg;
	
	Osoba() {}
	
	Osoba(String ime, String prezime, int starost, String jmbg) {
		this.ime = ime;
		this.prezime = prezime;
		this.starost = starost;
		this.jmbg = jmbg;
		
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getStarost() {
		return starost;
	}

	public void setStarost(int starost) {
		this.starost = starost;
	}
	
	void predstaviSe() {
		System.out.println("Moje ime je " + getIme() + ", prezime " + getPrezime() + " i imam " + getStarost() + " godina.");
	}
}
