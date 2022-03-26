package restoran;
//Dodavanje, brisanje i traženje stavki u jelovniku
public interface RadSaJelovnikom {
	void dodajJelo(Jelo j);
	Jelo pronadjiJelo(String naziv);
	void obrisiJelo(String naziv);
	void ucitajJelovnik();
}
