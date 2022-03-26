package apstrakcija;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import restoran.Klijent;
//Tekstualna datoteka sadr�i podatke o kompanijama izlistanim na berzi u slede�em obliku: UnrealTrading UNT 5 35.66. Prvi parametar je 
//naziv kompanije, drugi skra�eni naziv kompanije, tre�i broj akcija kojima se mo�e trgovati i �etvrti je cena jedne akcije. Napisati 
//funkciju kojom se iz ove datoteke mogu u�itati podaci o proizvoljnom broju kompanija u dinami�ki niz listaKompanije koji je tipa 
//ArrayList<Kompanija>.

public class Kompanija {
	public void ucitajKompaniju(String imeFajla) throws IOException{
		Scanner sc = null;
		ArrayList<Kompanija> listaKlijenata = new ArrayList<Kompanija>();
		try {
			sc = new Scanner(new FileReader("Kompanije.txt"));
			do {
			String nazivKompanije = sc.next();
			String skrNazivKomp = sc.next();
			int brAkcija = sc.next();
			double cenaAkcije = sc.next();
			Kompanija k = new Kompanija(nazivKompanije, skrNazivKomp, brAkcija, cenaAkcije);
			listaKompanije.add(k);
		} while (sc.hasNext());		
	}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			if (sc != null)
				sc.close();
		}
		this.listaKompanije = listaKompanije;
}	
}
