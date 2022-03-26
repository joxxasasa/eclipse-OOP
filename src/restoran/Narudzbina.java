package restoran;

public class Narudzbina{
	private String idNarudzbine;
	private Klijent narucilac;
	private Jelo jelo;
	private boolean realizovana;
	
	Narudzbina() {}
	
	Narudzbina(String idNarudzbine, Klijent narucilac, Jelo jelo, boolean realizovana) {
		this.idNarudzbine = idNarudzbine;
		this.narucilac = narucilac;
		this.jelo = jelo;
		this.realizovana = realizovana;
	}

	public String getIdNarudzbine() {
		return idNarudzbine;
	}

	public void setIdNarudzbine(String idNarudzbine) {
		this.idNarudzbine = idNarudzbine;
	}

	public Klijent getNarucilac() {
		return narucilac;
	}

	public void setNarucilac(Klijent narucilac) {
		this.narucilac = narucilac;
	}

	public Jelo getJelo() {
		return jelo;
	}

	public void setJelo(Jelo jelo) {
		this.jelo = jelo;
	}

	public boolean isRealizovana() {
		return realizovana;
	}

	public void setRealizovana(boolean realizovana) {
		this.realizovana = realizovana;
	}
	
	public String toString() {
		return narucilac.getIme() + " " + narucilac.getPrezime() + " je porucio " + 
				getJelo() + " sa brojem narudzbine: " + getIdNarudzbine() + " i statusom realizacije: " + isRealizovana() + " ";
	}
	
	
}
