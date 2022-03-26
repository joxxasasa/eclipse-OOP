package oblik;

public class Kvadrat extends Oblik implements Figura{
	double duzinaStranice;
	
	Kvadrat() {}
	
	Kvadrat(String boja, String tip, int brojStrana, double povrsina, double duzinaStranice) {
		super(boja, tip, brojStrana, povrsina);
		this.duzinaStranice = duzinaStranice;
	}

	public double getDuzinaStranice() {
		return duzinaStranice;
	}

	public void setDuzinaStranice(double duzinaStranice) {
		this.duzinaStranice = duzinaStranice;
	}

	@Override
	public double racunajPovrsinu() {
		return duzinaStranice * duzinaStranice;
	}

	@Override
	public double racunajObim() {
		return 4 * duzinaStranice;
	}
	
	public void stampajKvadrat() {
		System.out.println("Kvadrat boje: " + getBoja() 
						+ ", tipa: " + getTip() 
						+ ", broja strana: " + getBrojStrana() 
						+ " ima obim: " + racunajObim() + " i povrsinu: " + racunajPovrsinu());
	}
}
