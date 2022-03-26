package banka;

import java.util.ArrayList;
import java.util.*;

public class Banka implements RadSaKlijentima, RadSaTransakcijama{
	private ArrayList<Klijent> klijenti;
	private ArrayList<Transakcija> transakcije;
	
	Banka() {
		super();
		this.klijenti = new ArrayList<Klijent>();
		this.transakcije = new ArrayList<Transakcija>();
	}

	@Override
	public void dodajKlijenta(Klijent k) {
		if (pronadjiKlijenta(k.getJmbg()) == null) {
		klijenti.add(k);
		System.out.println("Uspesno je dodat klijent sa jmbg " + k.getJmbg());
		return;
		}
	}

	@Override
	public void obrisiKlijenta(String jmbg) {
		Klijent k = pronadjiKlijenta(jmbg);
		
		if (k != null) {
		klijenti.remove(k);
		System.out.println("Uspesno je izbrisan klijent sa jmbg " + k.getJmbg());
		return;
		}
		System.out.println("Klijent sa jmbg " + jmbg + " se ne nalazi u bazi");
	}

	@Override
	public Klijent pronadjiKlijenta(String jmbg) {
		for (Klijent klijent : klijenti) {
			if (klijent.getJmbg().equals(jmbg)) {
				return klijent;
			}
		}
		return null;
	}

	@Override
	public boolean izvrsiInternuTransakciju(Klijent posiljalac, Klijent primalac, float iznos) {
		if (iznos > posiljalac.getBrojRacuna().getStanje()) {
			throw new IllegalStateException("Nema dovoljno sredstava na racunu posiljaoca.");
		}
		
		posiljalac.getBrojRacuna().setStanje(posiljalac.getBrojRacuna().getStanje() - iznos);
		primalac.getBrojRacuna().setStanje(posiljalac.getBrojRacuna().getStanje() + iznos);
		Transakcija transakcija = new Transakcija(primalac, posiljalac, iznos, true);
		System.out.println(transakcija);
		return true;
	}
}	
	
