package oop;

public class Test {
	public static void main(String[] args) {
		/*
		Poruka p = new Poruka();
		p.tekst = "Zdravo svete!";
		p.postaviPoruku("Zdravo OOP svete!");
		p.prikaziPoruku();
*/
		Poruka p, p1, p2, p3; // Deklarisanje 4 prom. klase Poruka
		p = new Poruka(); // Kreiramo novi objekat klase Poruka i èuvamo referencu na taj objekat u promenljivoj p.
		p1 = new Poruka(); // Kreiramo još jedan objekat klase Poruka i èuvamo referencu na njega u promenljivoj p1.
		p2 = p1; // Kopiramo vrednost reference iz p1 u promenljivu p2.
		p3 = null; // Postavljamo null referencu u promenljivu p3.
		p.tekst = " Hello world!";// Postavljamo vrednost atributa
		p1.tekst = "Zdravo svete!";//tekst instanci na neke vrednosti
		
		p.postaviPoruku("Hello world!");
		p.prikaziPoruku();
		
		p1.postaviPoruku("Zdravo svete!");
		p1.prikaziPoruku();
		
		p2.postaviPoruku("ijhuyguy");
		p2.prikaziPoruku();
		
		p1.prikaziPoruku();
		
}
}