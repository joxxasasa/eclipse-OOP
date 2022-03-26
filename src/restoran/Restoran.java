package restoran;

import java.io.IOException;

public class Restoran {
	private String ime;
	private ListaKlijenata klijenti;
	private Jelovnik jelovnik;
	private ListaNarudzbina narudzbine;
	
	Restoran() {}
	
	Restoran(String ime, ListaKlijenata klijenti, Jelovnik jelovnik, ListaNarudzbina narudzbine) {
		this.ime = ime;
		this.klijenti = klijenti;
		this.jelovnik = jelovnik;
		this.narudzbine = narudzbine;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public void dodajKlijenta(Klijent k) {
		klijenti.dodajKlijenta(k);
	}
	
	public void obrisiKlijenta(String brojTelefona) {
		klijenti.obrisiKlijenta(brojTelefona);
	}
	
	public void pronadjiKlijenta(String brojTelefona) {
		klijenti.pronadjiKlijenta(brojTelefona);
	}
	
	public void ucitajKlijente(String imeFajla) throws IOException{
		klijenti.ucitajKlijente("Klijenti.txt");
	}
	
	public void stampajKlijente() {
		klijenti.stampajListu();
	}
	
	public void dodajJelo(Jelo j) {
		jelovnik.dodajJelo(j);
	}
	
	public void pronadjiJelo(String naziv) {
		jelovnik.pronadjiJelo(naziv);
	}
	
	public void obrisiJelo(String naziv) {
		jelovnik.pronadjiJelo(naziv);
	}
	
	public void ucitajJelovnik(String imeFajla) {
		jelovnik.ucitajJelovnik();
	}
	
	public void stampajJelovnik() {
		jelovnik.stampajListu();
	}
	
	public void dodajNarudzbinu(Narudzbina n) {
		narudzbine.dodajNarudzbinu(n);
	}
	
	public void obrisiNarudzbinu(String idNarudzbine) {
		narudzbine.obrisiNarudzbinu(idNarudzbine);
	}
	
	public void pronadjiNarudzbinu(String idNarudzbine) {
		narudzbine.pronadjiNarudzbinu(idNarudzbine);
	}
	
	public void stampajNarudzbine() {
		narudzbine.stampajListu();
	}
	
	public void napraviNarudzbinu(String idNarudzbine, Klijent narucilac, Jelo jelo, boolean realizovana) {
		narudzbine.napraviNarudzbinu(idNarudzbine, narucilac, jelo, realizovana);
	}
	
	public void upisiNarudzbinu(String imeFajla) {
		narudzbine.upisiNarudzbinu(imeFajla);
	}
}
