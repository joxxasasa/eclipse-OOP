package restoran;

import java.io.IOException;

public interface RadSaKlijentima {
	void dodajKlijenta(Klijent k);
	void obrisiKlijenta(String brojTelefona);
	Klijent pronadjiKlijenta(String brojTelefona);
	void ucitajKlijente(String imeFajla) throws IOException;
}
