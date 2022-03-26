package vozniPark;

public class Motocikl extends Vozilo {
	private boolean registrovan;

	Motocikl(String marka, String tip, String registracija, int godiste, Osoba vlasnik, boolean registrovan, boolean radi, String tipMotor, int snaga, int kubikaza, int stepenPrenosa, double brzina){
		super(marka, tip, registracija, godiste, vlasnik, radi, tipMotor, snaga, kubikaza, stepenPrenosa, brzina);
		this.registrovan = registrovan;
	}
	
	public boolean isRegistrovan() {
		return registrovan;
	}

	public void setRegistrovan(boolean registrovan) {
		this.registrovan = registrovan;
	}
	
	public void stampajPodatke() {
		System.out.println(getMarka() + " " + 
			getTip() + " " + 
			getGodiste() + " " + 
	 		getRegistracija() + " " +
			isRegistrovan() + " " +
	 		vlasnik.getIme() + " " + 
			vlasnik.getPrezime() + " " +
	 		getStepenPrenosa() + " " +
			getBrzina());
		this.popAgregat.stampajPodatke();
	}


}
