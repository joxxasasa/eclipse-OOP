package apstrakcija;
//Napisati klasu SekundarnaBerza koja nasleðuje klasu apstraktnu Berza i implementira interfejs RadSaTransakacijama. Klasa ima atribute 
//listaTrgovaca (tipa ArrayList<Trgovac>), listaKompanije (tipa ArrayList<Kompanija>) i listaTransakcija (tipa ArrayList<Transakcija>), 
//konstruktor (napomena: roditeljska klasa ima atribute: naziv, tipa String; grad, tipa String; nazivIndeksa tipa String; vrednostIndeksa, 
//tipa double) i metode za pribavljanje i postavljanje atributa (getere i setere). Interfejs RadSaTransakcijama ima samo metodu 
//izvrsiTransakciju koja vlasnistvo nad kompanijom iz niza listeKompanija prenosi sa jednog na drugog trgovca iz niza listaTrgovaca. 
//Prepostaviti da svaka kompanija kao atribute ima vlasnika (tipa String), skraceniNaziv (tip Stringa), broj akcija (pozitivan ceo broj) i 
//cena akcije (realan broj). Kod svih atributa i metoda navesti i odgovarajuæe pristupne atribute.

import java.util.ArrayList;

import banka.Klijent;
import banka.Transakcija;

public class SekundarnaBerza extends Berza implements RadSaTransakcijama{
	ArrayList<Trgovac> listaTrgovaca;
	ArrayList<Kompanija> listakompanija;
	ArrayList<Transakcija> listaTransakcija;
	
	SekundarnaBerza() {}
	
	SekundarnaBerza(String naziv, String grad, String nazivIndeksa, double vrednostIndeksa) {
		super(naziv, grad, nazivIndeksa, vrednostIndeksa);
		this.listaTrgovaca = new ArrayList<Trgovac>();
		this.listakompanija = new ArrayList<Kompanija>();
		this.listaTransakcija = new ArrayList<Transakcija>();
		
	}

	public ArrayList<Trgovac> getListaTrgovaca() {
		return listaTrgovaca;
	}

	public void setListaTrgovaca(ArrayList<Trgovac> listaTrgovaca) {
		this.listaTrgovaca = listaTrgovaca;
	}

	public ArrayList<Kompanija> getListakompanija() {
		return listakompanija;
	}

	public void setListakompanija(ArrayList<Kompanija> listakompanija) {
		this.listakompanija = listakompanija;
	}

	public ArrayList<Transakcija> getListaTransakcija() {
		return listaTransakcija;
	}

	public void setListaTransakcija(ArrayList<Transakcija> listaTransakcija) {
		this.listaTransakcija = listaTransakcija;
	}
	
	public boolean izvrsiTransakciju(Trgovac posiljalac, Trgovac primalac, int iznos) {
		if (iznos > posiljalac.getBrojRacuna().getStanje()) {
			throw new IllegalStateException("Nema dovoljno akcija u vlasnistvu.");
		}
		
		posiljalac.getskrNazivKomp().setbrAkcija(posiljalac.getskrNazivKomp().getbrAkcija() - iznos);
		primalac.getskrNazivKomp().setbrAkcija(posiljalac.getskrNazivKomp().getbrAkcija() + iznos);
		Transakcija transakcija = new Transakcija(primalac, posiljalac, iznos, true);
		System.out.println(transakcija);
		return true;
	}
}
//izvrsiTransakciju koja vlasnistvo nad kompanijom iz niza listeKompanija prenosi sa jednog na drugog trgovca iz niza listaTrgovaca. 
//Prepostaviti da svaka kompanija kao atribute ima vlasnika (tipa String), skraceniNaziv (tip Stringa), broj akcija (pozitivan ceo broj) i 
//cena akcije (realan broj). Kod svih atributa i metoda navesti i odgovarajuæe pristupne atribute.