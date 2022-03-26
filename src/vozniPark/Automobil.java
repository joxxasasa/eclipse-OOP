package vozniPark;

public class Automobil extends Vozilo {
	private int brojVrata;
	Automobil(String marka, String tip, String registracija, int godiste, Osoba vlasnik, int brojVrata, 
			  boolean radi, String tipMotor, int snaga, int kubikaza, int stepenPrenosa, double brzina){
		super(marka, tip, registracija, godiste, vlasnik, radi, tipMotor, snaga, kubikaza, stepenPrenosa, brzina);
		this.brojVrata = brojVrata;
	}
	public int getBrojVrata() {
		return brojVrata;
	}
	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}
	
	public void stampajPodatke() {
		System.out.println(getMarka() + " " + 
			getTip() + " " + 
			getGodiste() + " " + 
	 		getRegistracija() + " " +
			getBrojVrata() + " " +
	 		vlasnik.getIme() + " " + 
			vlasnik.getPrezime()  + " " +
	 		getStepenPrenosa() + " " +
			getBrzina());
		this.popAgregat.stampajPodatke();
	}

}
