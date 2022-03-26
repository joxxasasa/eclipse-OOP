package restoran;

public interface RadSaNarudzbinama {
	void dodajNarudzbinu(Narudzbina n);
	void obrisiNarudzbinu(String idNarudzbine);
	Narudzbina pronadjiNarudzbinu(String idNarudzbine);
	void upisiNarudzbinu(String imeFajla);
}
