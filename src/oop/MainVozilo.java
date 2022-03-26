package oop;

public class MainVozilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vozilo prvi = new Vozilo("Renault", "Scenic", 2010, "BG 123 GB", 170, 105);
		prvi.racunajVrednost();
		prvi.stampajPodatke();
		
		Vozilo drugi = new Vozilo("Renault", "Modus", 2004, "BG 122 GB", 140, 90);
		drugi.racunajVrednost();
		drugi.stampajPodatke();
		
		Vozilo treci = new Vozilo("Renault", "Megan", 2008, "BG 124 GB", 150, 100);
		treci.racunajVrednost();
		treci.stampajPodatke();
		
		
	}

}
