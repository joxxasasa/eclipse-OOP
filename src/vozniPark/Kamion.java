package vozniPark;

public class Kamion extends Vozilo {
	private int brojOsovina;

	Kamion(String marka, String tip, String registracija, int godiste, Osoba vlasnik, int brojOsovina, boolean radi, String tipMotor, int snaga, int kubikaza, int stepenPrenosa, double brzina){
		super(marka, tip, registracija, godiste, vlasnik, radi, tipMotor, snaga, kubikaza, stepenPrenosa, brzina);
		this.brojOsovina = brojOsovina;
	}

	public int getBrojOsovina() {
		return brojOsovina;
	}

	public void setBrojOsovina(int brojOsovina) {
		this.brojOsovina = brojOsovina;
	}
	
	public void stampajPodatke() {
		//super.stampajPodatke();
		System.out.println(getMarka() + " " + 
			getTip() + " " + 
			getGodiste() + " " + 
	 		getRegistracija() + " " +
			getBrojOsovina() + " " +
	 		vlasnik.getIme() + " " + 
			vlasnik.getPrezime() + " " +
	 		getStepenPrenosa() + " " +
			getBrzina());
		this.popAgregat.stampajPodatke();
	}
}
