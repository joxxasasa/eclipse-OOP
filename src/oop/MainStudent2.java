package oop;

public class MainStudent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 prvi = new Student2("Sasa", "Jovkovic", 45.8, 32.7);
		Student2 drugi = new Student2("Marija", "Jovkovic", 55.3, 38.3);
		
		prvi.racunajProsek();
		drugi.racunajProsek();
		prvi.stampajRezultat();
		drugi.stampajRezultat();
	}

}
