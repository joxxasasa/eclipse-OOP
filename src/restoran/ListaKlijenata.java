package restoran;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListaKlijenata implements RadSaKlijentima{
	ArrayList<Klijent> listaKlijenata;
	
	ListaKlijenata() {}
	
	ListaKlijenata(ArrayList<Klijent> listaKlijenata) {
		this.listaKlijenata = new ArrayList<Klijent>();
	}

	@Override
	public void dodajKlijenta(Klijent k) {
		listaKlijenata.add(k);
		
	}

	@Override
	public void obrisiKlijenta(String brojTelefona) {
		Klijent k = pronadjiKlijenta(brojTelefona);
		if (k != null) {
			listaKlijenata.remove(k);
		}
	}

	@Override
	public Klijent pronadjiKlijenta(String brojTelefona) {
		Klijent k = null;
		for (int i = 0; i < listaKlijenata.size(); i++) 
			if(listaKlijenata.get(i).getBrojTelefona().equals(brojTelefona))
				k = listaKlijenata.get(i);
			return k;	
	}
	
	public void stampajListu() {
		System.out.println(Arrays.toString(this.listaKlijenata.toArray()));
	}

	@Override
	public void ucitajKlijente(String imeFajla) throws IOException{
		Scanner sc = null;
		ArrayList<Klijent> listaKlijenata = new ArrayList<Klijent>();
		try {
			sc = new Scanner(new FileReader("Klijenti.txt"));
			do {
			String ime = sc.next();
			String prezime = sc.next();
			String adresa = sc.next();
			String brojTelefona = sc.next();
			Klijent k = new Klijent(ime, prezime, adresa, brojTelefona);
			listaKlijenata.add(k);
		} while (sc.hasNext());		
	}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			if (sc != null)
				sc.close();
		}
		this.listaKlijenata = listaKlijenata;
}	
}
