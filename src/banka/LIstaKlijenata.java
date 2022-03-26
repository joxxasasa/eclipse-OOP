package banka;

import java.util.ArrayList;

public class LIstaKlijenata implements RadSaKlijentima, RadSaFajlovima{

	private ArrayList<Klijent> klijenti = new ArrayList<>();
	@Override
	public void ucitajIzFajla(String imeFajla) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upisiUFajl(String imeFajla) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dodajKlijenta(Klijent k) {
		klijenti.add(k);
		
	}

	@Override
	public void obrisiKlijenta(String jmbg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Klijent pronadjiKlijenta(String jmbg) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
