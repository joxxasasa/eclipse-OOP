package institucija;

public class Racunar extends RacunarskaUcionica{
	private String oznakaProcesora;
	private double radniTakt;
	private int kapacitetMemorije;
	private double indeksPerformansi;
	
	Racunar() {}
	
	Racunar(String oznakaProcesora, double radniTakt, int kapacitetMemorije) {
		this.oznakaProcesora = oznakaProcesora;
		this.radniTakt = radniTakt;
		this.kapacitetMemorije = kapacitetMemorije;
		
		racunajIndex();
	}
	
	
	public String getOznakaProcesora() {
		return oznakaProcesora;
	}

	public double getRadniTakt() {
		return radniTakt;
	}

	public int getKapacitetMemorije() {
		return kapacitetMemorije;
	}

	public void setOznakaProcesora(String oznakaProcesora) {
		this.oznakaProcesora = oznakaProcesora;
	}

	public void setRadniTakt(double radniTakt) {
		this.radniTakt = radniTakt;
	}

	public void setKapacitetMemorije(int kapacitetMemorije) {
		this.kapacitetMemorije = kapacitetMemorije;
	}

	double racunajIndex() {
		indeksPerformansi = 100 * radniTakt + kapacitetMemorije;
		return indeksPerformansi;
	}
	
	public void stampajPodatke() {
		System.out.print("Racunar sa " + oznakaProcesora + " procesorom, radnim taktom od " + radniTakt + " GHz i " + kapacitetMemorije + " GB memorije ima sledeci indeks proformansi:");
		System.out.printf("%7.2f\n", racunajIndex());
	}
}
