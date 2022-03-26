package spisakPolaznika;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		SpisakPolaznika polaznici = new SpisakPolaznika();
		
		polaznici.ucitajListu("spisak.txt");
		polaznici.stampajListu();
		polaznici.sortirajListu();
		polaznici.stampajListu();
		polaznici.upisiListu("uredjeniSpisak");
		
	}

}
