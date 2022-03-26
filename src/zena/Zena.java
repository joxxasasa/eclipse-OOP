package zena;

public class Zena extends Osoba {
		protected String devPrezime;
		
		Zena() {
			
		}
		
		Zena(String ime, String prezime, int starost) {
			super(ime, prezime, starost);
			this.devPrezime = devPrezime;
			
		}

		public String getDevPrezime() {
			return devPrezime;
		}

		public void setDevPrezime(String devPrezime) {
			this.devPrezime = devPrezime;
		}
		
		@Override
		void predstaviSe() {
			System.out.println("Moje ime je " + getIme() 
								+ ", prezime " + getPrezime() 
								+ " i devojacko prezime mi je " + getDevPrezime());
		}
}
