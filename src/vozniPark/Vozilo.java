package vozniPark;

public class Vozilo implements Voznja{
	protected String marka;
	protected String tip;
	protected String registracija;
	protected int godiste;
	protected Osoba vlasnik; 
	protected Motor popAgregat;
	protected int stepenPrenosa;
	protected double brzina;
	
	Vozilo(String marka, String tip, String registracija, int godiste, Osoba vlasnik, 
		   boolean radi, String tipMotor, int snaga, int kubikaza, int stepenPrenosa, double brzina){
		this.marka = marka;
		this.tip = tip;
		this.registracija = registracija;
		this.godiste = godiste;
		this.vlasnik = vlasnik;
		this.stepenPrenosa = stepenPrenosa;
		this.brzina = brzina;
		
		this.popAgregat = new Motor(radi, tipMotor, snaga, kubikaza);
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getRegistracija() {
		return registracija;
	}
	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}
	public int getGodiste() {
		return godiste;
	}
	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}
	public Osoba getVlasnik() {
		return vlasnik;
	}

	public boolean pokreniVozilo() {
		popAgregat.ukljuci();
		return popAgregat.pribaviRadi();
	}
	
	public boolean zaustaviVozilo() {
		popAgregat.iskljuci();
		return !popAgregat.pribaviRadi();
	}
	
	protected void prenosVlasnistva(Osoba noviVlasnik) {
		this.vlasnik = noviVlasnik;
	}
	public int getStepenPrenosa() {
		return stepenPrenosa;
	}
	public void setStepenPrenosa(int stepenPrenosa) {
		this.stepenPrenosa = stepenPrenosa;
	}
	public double getBrzina() {
		return brzina;
	}
	public void setBrzina(double brzina) {
		this.brzina = brzina;
	}
	protected void stampajPodatke() {
		System.out.println(getMarka() + " " + getTip() + " " + getGodiste() + " " + getRegistracija() + " " + vlasnik.getIme() + " " + vlasnik.getPrezime());
	}
	@Override
	public void povecajStepenPrenosa() {
		stepenPrenosa += stepenPrenosa;
		
	}
	@Override
	public void smanjiStepenPrenosa() {
		stepenPrenosa -= stepenPrenosa;
		
	}
	@Override
	public void ubrzaj() {
		brzina += 30;
		
	}
	@Override
	public void uspori() {
		brzina -= 30;
		
	}
	@Override
	public void ukljuci() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void iskljuci() {
		// TODO Auto-generated method stub
		
	}

}
