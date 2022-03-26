package restoran;

public class Klijent {
	private String ime, prezime, adresa, brojTelefona;
		
	Klijent() {}
	
	public Klijent(String ime, String prezime, String adresa, String brojTelefona) {
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		this.brojTelefona = brojTelefona;
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

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

	public String toString() {
		return "Klijent " + getIme() + " " + getPrezime() + " zivi u " + getAdresa() + " sa brojem telefona: " + getBrojTelefona();
	}
}
