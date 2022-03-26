package oblik;

public class Main {

	public static void main(String[] args) {
		Krug kr = new Krug("crvena", "krug", 0, 0, 3);
		Kvadrat kv = new Kvadrat("bela", "kvadrat", 4, 0, 5);
		
		kr.racunajObim();
		kr.racunajPovrsinu();
		kr.stampajKrug();
		
		kv.racunajObim();
		kv.racunajPovrsinu();
		kv.stampajKvadrat();
		
	}

}
