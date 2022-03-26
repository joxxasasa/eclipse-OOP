package oblik;

public class Oblik implements Figura{
	private String boja, tip;
	private int brojStrana;
	private double povrsina;
	
	Oblik() {}
	
	Oblik(String boja, String tip, int brojStrana, double povrsina) {
		this.boja = boja;
		this.tip = tip;
		this.brojStrana = brojStrana;
		this.povrsina = povrsina;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getBrojStrana() {
		return brojStrana;
	}

	public void setBrojStrana(int brojStrana) {
		this.brojStrana = brojStrana;
	}

	public double getPovrsina() {
		return povrsina;
	}

	public void setPovrsina(double povrsina) {
		this.povrsina = povrsina;
	}

	@Override
	public double racunajPovrsinu() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double racunajObim() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}	
	

