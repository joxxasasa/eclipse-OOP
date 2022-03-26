package banka;

public interface RadSaKlijentima {
	void dodajKlijenta(Klijent k);
	void obrisiKlijenta(String jmbg);
	Klijent pronadjiKlijenta(String jmbg);
}
