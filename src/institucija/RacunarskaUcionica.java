package institucija;
		
public class RacunarskaUcionica extends Ucionica {
		static final int MAXBRRACUNARA = 20;
		protected Racunar racunar;
		
		RacunarskaUcionica() {}
		
		RacunarskaUcionica(String oznaka, String tip, int brMesta, double povrsina, Racunar racunar) {
			super(oznaka, tip, brMesta, povrsina);
			this.racunar = racunar;
		}

		
}
