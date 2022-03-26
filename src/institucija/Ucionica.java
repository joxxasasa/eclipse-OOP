package institucija;

public class Ucionica extends Institucija {
		protected String oznaka;
		protected String tip;
		protected int brMesta;
		protected double povrsina;
		
		Ucionica() {}
		
		Ucionica(String oznaka, String tip, int brMesta, double povrsina) {
			this.oznaka = oznaka;
			this.tip = tip;
			this.brMesta = brMesta;
			this.povrsina = povrsina;
		}
}
