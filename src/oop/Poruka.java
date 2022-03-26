package oop;

public class Poruka {
	String tekst;

	void postaviPoruku(String noviTekst) {
		tekst = noviTekst;
	}

	void prikaziPoruku() {
		System.out.println(tekst);
	}
}

