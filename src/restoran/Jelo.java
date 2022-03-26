package restoran;

public class Jelo {
	String naziv, tip;
	double cena;
	
	Jelo() {}
	
	public Jelo(String naziv, String tip, double cena) {
		super();
		this.naziv = naziv;
		this.tip = tip;
		this.cena = cena;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}
	
	public String toString() {
		return getNaziv() + " (" + getTip() + ") sa cenom od " + getCena() + " dinara";
	}
}
