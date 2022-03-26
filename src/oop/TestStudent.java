package oop;

public class TestStudent {
	public static void main(String[] args) {
		Student prvi = new Student();
		Student drugi = new Student();
		
		prvi.postaviImePrezime("Petar", "Petrovic");
		drugi.postaviImePrezime("Ivana", "Ivanovic");
		
		prvi.postaviPoene(39.5, 53.8);
		drugi.postaviPoene(38.7, 57.5);
		prvi.racunajProsek();
		drugi.racunajProsek();
		prvi.stampajPoene();
		drugi.stampajPoene();
	}
}
