package oblik;

public class Krug extends Oblik implements Figura{
	double poluprecnik;
	
	Krug() {}
	
	Krug(String boja, String tip, int brojStrana, double povrsina, double poluprecnik) {
		super(boja, tip, brojStrana, povrsina);
		this.poluprecnik = poluprecnik;
	}
	
	public void stampajKrug() {
		System.out.println("Krug boje: " + getBoja() 
						+ ", tipa: " + getTip() 
						+ ", broja strana: " + getBrojStrana() 
						+ " ima obim: " + racunajObim() + " i povrsinu: " + racunajPovrsinu());
	}

	@Override
	public double racunajPovrsinu() {
		return Math.round(poluprecnik * poluprecnik * Math.PI);
	}

	@Override
	public double racunajObim() {
		return Math.round(2 * poluprecnik * Math.PI);
	}
	
}
