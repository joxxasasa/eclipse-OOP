package oopNasledjivanje;

public class Klijent extends Osoba{
	private String banka;
	private String brRacuna;
	private double saldo;
	
	Klijent() {}
	
	Klijent(String ime, String prezime, int starost, String banka, String brRacuna, double saldo) {
		super(ime, prezime, starost);
		this.banka = banka;
		this.brRacuna = brRacuna;
		this.saldo = saldo;
		
	}

	public String getBanka() {
		return banka;
	}

	public void setBanka(String banka) {
		this.banka = banka;
	}

	public String getBrRacuna() {
		return brRacuna;
	}

	public void setBrRacuna(String brRacuna) {
		this.brRacuna = brRacuna;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void umanjenjeSalda(double iznos) {
		saldo = saldo - iznos;
	}
	
	public void uvecanjesalda(double iznos) {
		saldo = saldo + iznos;
	}
	
	public void prikaziSaldo() {
		System.out.print("Klijent banke " + getBanka() + " " + getIme() + " " + getPrezime() + " ima racun " + getBrRacuna() + " sa saldom od " + getSaldo() + " dinara.");
	}
}
