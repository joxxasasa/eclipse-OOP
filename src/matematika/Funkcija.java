package matematika;

public interface Funkcija {
		void ucitajParametre(String imeFajla);
		double izracunajVrednost();
		void proveriRealneNule();
		void  izracunajNule();
		void upisiNule(String imeFajla);
		void stampajVrednosti();
		
}
//Napraviti paket matematika i u okviru njega implementirati:
//
//1. Interfejs Funkcija koji sadr�i slede�ih pet metode: u�itavanje parametara funkcije iz tekstualne datoteke - ucitajParametre,
//izra�unavanje vrednosti funkcije u zadatoj ta�ki - izracunajVrednost, ispitivanje da li funkcija ima realne nule - 
//proveriRealneNule, nala�enje nula funkcije - izracunajNule i ispisivanje nula u tekstualnu datoteku - upisiNule.
//2. Klasu LinearnaFunkcija (za predstavljanje funkcija oblika y=a*x+b) koja implementira interfejs Funkcija.
//3. Klasu KvadratnaFunkcija (za predstavljanje funkcija oblika y=a*x^2+b*x+c) koja tako�e implementira interfejs Funkcija.
//
//U test klasi definisati dve promenljive tipa interfejsa Funkcija, jednu referencirati na objekat tipa LinearnaFunkcija, a 
//drugu na tip KvadratnaFunkcija. Parametre funkcija u�itati iz datoteka funkcijaLinearna.txt (u datoteci su zapisani parametri 
//a i b) i funkcijaKvadratna.txt (u datoteci su zapisani parametru a, b i c). Potom upisati nule funkcija (ukoliko 
//	postoje) u izlazne datoteke nuleLinearne.txt i nuleKvadratne.txt, respektivno.