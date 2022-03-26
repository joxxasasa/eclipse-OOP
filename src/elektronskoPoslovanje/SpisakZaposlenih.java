package elektronskoPoslovanje;
//
public class SpisakZaposlenih {
	private Zaposleni[] zaposleni;
	private int trenutniBrojZaposlenih;
	private int maxBrojZaposlenih;
	//
	SpisakZaposlenih() {}
	
	SpisakZaposlenih(int maxBrojZaposlenih) {
		this.maxBrojZaposlenih = maxBrojZaposlenih;
		this.trenutniBrojZaposlenih = trenutniBrojZaposlenih;
		this.zaposleni = new Zaposleni[maxBrojZaposlenih];
	}
	
	public String nadjiZaposlenog(Zaposleni zaposleni) {
		int i;
		for (i = 0; i < this.trenutniBrojZaposlenih; i++) {
			if (this.zaposleni[i] == zaposleni) {
				return this.zaposleni[i].getIme();
			}
		}
		return ("Zaposleni nije pronadjen!");
	}
	
	public void dodajZaposlenog(Zaposleni zaposleni) {
		if (trenutniBrojZaposlenih < maxBrojZaposlenih) {
			this.zaposleni[this.trenutniBrojZaposlenih++] = zaposleni;
			System.out.println("Uspesno dodat zaposleni " +zaposleni+"!");
		}
		else{
			System.out.println("Nema vise mesta u spisku zaposlenih!");
		}
	}
	
	public void obrisiZaposlenog(Zaposleni zaposleni) {
		
	}
}
