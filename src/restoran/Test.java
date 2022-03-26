package restoran;

import java.io.IOException;

//Program za podr�ku poslovanju restorana sa isporukom
//Restorani koji nude isporuku hrane na ku�nu adresu u svom poslovanju vode evidenciju o klijentima, jelovniku i narud�binama. 
//Za klijente bele�e ime, prezime, adresu i broj mobilnog telefona. Za svaku od stavki u jelovniku pamti se naziv stavke, 
//tip (predjelo, glavno jelo, salata, dezert, pi�e) i cena. Narud�bina se sastoji od jedne ili vi�e stavki iz jelovnika koje je 
//naru�io odre�eni klijent, kao i informacije o tome da li je narud�bina uspe�no realizovana ili ne.
//Realizovati slede�e funkcionalnosti:
//� U�itavanje podataka o klijentima i jelovniku iz datoteka (klijenti.txt, jelovnik.txt)
//� Dodavanje, brisanje i tra�enje stavki u jelovniku
//� Dodavanje, brisanje i tra�enje klijenta
//� Dodavanje, brisanje i tra�enje narud�bine
//� Upis podataka o svim narud�binama u datoteku
//Dodati i klase za podr�ku za listama odgovaraju�ih objekata (ListaKlijenata, ListaNarud�bina - Jelovnik je sam po sebi ve� 
//		lista Stavki). U test klasi kreirati restoran, u�itati podatke o jelovniku i klijentima i kreirati nekoliko narud�bina. 
//Podatke o realizovanim narud�binama upisati u izlaznu datoteku.
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
