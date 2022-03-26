package elektronskoPoslovanje;

public class SpisakKlijenata {
	private Osoba[] klijent;
	private int trenutniBrojKlijenata;
	private int maxBrojKlijenata;
	
	SpisakKlijenata(){}
	
	SpisakKlijenata(int maxBrojKlijenata){
		this.maxBrojKlijenata = maxBrojKlijenata;
		this.trenutniBrojKlijenata = 0;
		this.klijent = new Osoba[maxBrojKlijenata];
	}
	
	public String nadjiKlijenta(Osoba klijent) {
		int i;
		for (i = 0; i < this.trenutniBrojKlijenata; i++) {
			if (this.klijent[i] == klijent) {
				return this.klijent[i].getIme();
			}
		}
		return ("Klijent nije pronadjen!");
	}
	
	public void dodajKlijenta(Osoba klijent) {
		if (trenutniBrojKlijenata < maxBrojKlijenata) {
			this.klijent[this.trenutniBrojKlijenata++] = klijent;
			System.out.println("Uspesno dodat klijent " +klijent+"!");
		}
		else{
			System.out.println("Nema vise mesta u spisku klijenata!");
		}
	}
}
