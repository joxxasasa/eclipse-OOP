package banka;

public class Klijent {
	private String ime, prezime, jmbg;
	private Racun brojRacuna;
	
	Klijent() {}
	
	public Klijent(String ime, String prezime, String jmbg, Racun brojRacuna, float stanje, boolean aktivan, String valuta) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.brojRacuna = new Racun(stanje, aktivan, valuta);
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

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public Racun getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(Racun brojRacuna) {
		this.brojRacuna = brojRacuna;
	}
	@Override
	public String toString() {
		return (" ");
	}
	
}
