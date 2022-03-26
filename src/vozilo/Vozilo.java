package vozilo;

public class Vozilo {
		protected String marka, tip, registracija;
		protected int godiste;
		protected Osoba vlasnik;
		protected Motor pogAgregat;
		
		Vozilo() {}
		
		Vozilo(String marka, String tip, String registracija, int godiste, Osoba vlasnik) {
			this.marka = marka;
			this.tip = tip;
			this.godiste = godiste;
			this.vlasnik = vlasnik;
			
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

		public void setVlasnik(Osoba vlasnik) {
			this.vlasnik = vlasnik;
		}
		
		void stampajPodatke() {
			System.out.println("Vlasnik automobila " + getMarka() + " " + getTip() + " registracije " + getRegistracija() + " godine proizvodnje " + " je " + vlasnik.getIme() + " " + vlasnik.getPrezime());
		}
		
		
}
