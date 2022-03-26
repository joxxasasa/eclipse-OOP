package spisakPolaznika;

public class Osoba {
	protected String ime;
	protected String prezime;
	protected String jmbg;
	
	Osoba() {}
	
	Osoba(String ime, String prezime, String jmbg) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
	}

	public String getIme() {
		return this.ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return this.prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getJmbg() {
		return this.jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String toString() {
		return ("Ime: " + this.getIme() + ", prezime: " + this.getPrezime() + " i jmbg: " + this.getJmbg());
	}
}
