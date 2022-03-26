package matematika;

public class Test {

	public static void main(String[] args) {
		
		Funkcija LinearnaFunkcija = new LinearnaFunkcija(5);
		Funkcija KvadratnaFunkcija = new KvadratnaFunkcija(10);
		
		LinearnaFunkcija.ucitajParametre("funkcijaLinearna.txt");
		KvadratnaFunkcija.ucitajParametre("funkcijaKvadratna.txt");
		LinearnaFunkcija.izracunajVrednost();
		LinearnaFunkcija.stampajVrednosti();
		KvadratnaFunkcija.izracunajVrednost();
		KvadratnaFunkcija.stampajVrednosti();
		System.out.println("------------------------------------------------------");
		LinearnaFunkcija.proveriRealneNule();
		KvadratnaFunkcija.proveriRealneNule();
		LinearnaFunkcija.izracunajNule();
		KvadratnaFunkcija.izracunajNule();
		LinearnaFunkcija.upisiNule("nuleLinearne.txt");
		KvadratnaFunkcija.upisiNule("nuleKvadratne.txt");

	}

}
