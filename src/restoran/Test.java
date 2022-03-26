package restoran;

import java.io.IOException;

//Program za podršku poslovanju restorana sa isporukom
//Restorani koji nude isporuku hrane na kuænu adresu u svom poslovanju vode evidenciju o klijentima, jelovniku i narudžbinama. 
//Za klijente beleže ime, prezime, adresu i broj mobilnog telefona. Za svaku od stavki u jelovniku pamti se naziv stavke, 
//tip (predjelo, glavno jelo, salata, dezert, piæe) i cena. Narudžbina se sastoji od jedne ili više stavki iz jelovnika koje je 
//naruèio odreðeni klijent, kao i informacije o tome da li je narudžbina uspešno realizovana ili ne.
//Realizovati sledeæe funkcionalnosti:
//• Uèitavanje podataka o klijentima i jelovniku iz datoteka (klijenti.txt, jelovnik.txt)
//• Dodavanje, brisanje i traženje stavki u jelovniku
//• Dodavanje, brisanje i traženje klijenta
//• Dodavanje, brisanje i traženje narudžbine
//• Upis podataka o svim narudžbinama u datoteku
//Dodati i klase za podršku za listama odgovarajuæih objekata (ListaKlijenata, ListaNarudžbina - Jelovnik je sam po sebi veæ 
//		lista Stavki). U test klasi kreirati restoran, uèitati podatke o jelovniku i klijentima i kreirati nekoliko narudžbina. 
//Podatke o realizovanim narudžbinama upisati u izlaznu datoteku.
public class Test {

	public static void main(String[] args) throws IOException {
		
		ListaKlijenata klijenti = new ListaKlijenata();
		
		Jelovnik jelovnik = new Jelovnik();

		ListaNarudzbina narudzbine = new ListaNarudzbina();
		
		Restoran restoran = new Restoran("Moskva", klijenti, jelovnik, narudzbine);
		restoran.ucitajKlijente("Klijenti");
		restoran.ucitajJelovnik("Menu");
		restoran.stampajJelovnik();
		restoran.stampajKlijente();
		Jelo j = new Jelo("Pljeska", "glavno", 450.00);
		restoran.dodajJelo(j);
		restoran.stampajJelovnik();
		restoran.napraviNarudzbinu("1", klijenti.pronadjiKlijenta("0659876543"), jelovnik.pronadjiJelo("Pljeska"), false);
		restoran.napraviNarudzbinu("2", klijenti.pronadjiKlijenta("0628765432"), jelovnik.pronadjiJelo("Pizza"), true);
		restoran.napraviNarudzbinu("3", klijenti.pronadjiKlijenta("0607654321"), jelovnik.pronadjiJelo("Salata"), false);
		restoran.stampajNarudzbine();
		restoran.dodajNarudzbinu(narudzbine.pronadjiNarudzbinu("1"));
		restoran.upisiNarudzbinu("Narudzbine.txt");
		
//		klijenti.ucitajKlijente("Klijenti");
//		klijenti.stampajListu();
//		jelovnik.ucitajJelovnik();
//		jelovnik.stampajListu();
//		narudzbine.napraviNarudzbinu("01", klijenti.pronadjiKlijenta("0659876543"), jelovnik.pronadjiJelo("Hamburger"), true);
//		narudzbine.napraviNarudzbinu("02", klijenti.pronadjiKlijenta("0659876543"), jelovnik.pronadjiJelo("Pizza"), true);
//		Klijent k1 = new Klijent("MM", "LKJJ", "GVTFTRF", "267478");
//		Jelo j1 = new Jelo("Sarma", "Gl jelo", 1250.00);
//		Narudzbina n = new Narudzbina("03", k1, j1, true);
//		n.toString();
//		narudzbine.dodajNarudzbinu(n);
//		narudzbine.upisiNarudzbinu("Narudzbine.txt");
		
		
	}

}
