package vozilo;

public class Motor {
	protected boolean radi;
	protected String tip;
	protected int snaga;
	protected int kubikaza;
	
	Motor() {}
	
	Motor(boolean radi, String tip, int snaga, int kubikaza) {
		this.radi = radi;
		this.tip = tip;
		this.snaga = snaga;
		this.kubikaza = kubikaza;
		
	}

	public boolean isRadi() {
		return radi;
	}

	public void setRadi(boolean radi) {
		this.radi = radi;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getSnaga() {
		return snaga;
	}

	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}

	public int getKubikaza() {
		return kubikaza;
	}

	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}
	
	public void upaliMotor() {
		if (this.isRadi()==false)
		this.setRadi(true);
		}
		public void iskljuci() {
		if (this.isRadi()==true)
		this.setRadi(false);
		}
		
		public void stampajPodatke() {
			System.out.println("Podaci o motoru:");
			System.out.println("Ukljucen: " + isRadi() 
								+ "Tip: " + getTip()
								+ "Snaga: " + getTip()
								+ "Kubikaza:" + getKubikaza());
		}
}
