package apstrakcija;
//Napisati apstraktnu klasu Klub koja ima atribute: naziv (tipa String), sedi�te (tipa String) i godinaOsnivanja (tipa int); 
//metode za pribavljanje i postavljanje svih atributa (getere i setere), konstruktor kojim se postavljaju vrednosti svih atributa i 
//apstraktne metode za dodavanje igra�a i registrovanja igra�a za teku�u sezonu. Kod svih atributa i metoda navesti i odgovaraju�e 
//pristupne atribute.
public abstract class Klub {
	String naziv;
	String sediste;
	int godOsnivanja;
	
	Klub() {}
	
	Klub(String naziv, String sediste, int godOsnivanja) {
		this.naziv = naziv;
		this.sediste = sediste;
		this.godOsnivanja = godOsnivanja;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSediste() {
		return sediste;
	}

	public void setSediste(String sediste) {
		this.sediste = sediste;
	}

	public int getGodOsnivanja() {
		return godOsnivanja;
	}

	public void setGodOsnivanja(int godOsnivanja) {
		this.godOsnivanja = godOsnivanja;
	}
	
	public abstract String dodajIgraca();
	
	public abstract String registrujIgraca();
}
