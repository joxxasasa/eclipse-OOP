package matematika;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LinearnaFunkcija implements Funkcija{
	double a, b, x;
	
	LinearnaFunkcija() {}
	
	LinearnaFunkcija(double x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void ucitajParametre(String imeFajla) {
	Scanner s = null;
	try {
		s = new Scanner(new File(imeFajla));
			double a = s.nextDouble();
			double b = s.nextDouble();
			this.a = a;
			this.b = b;
	}
	catch (IOException e) {
		System.out.println(e.getMessage());
	}
	finally {
		if (s != null) {
			s.close();
			}
		}
	}
	
	public double izracunajVrednost() {
		return a * x + b;
	}
	
	public void stampajVrednosti() {
		System.out.println("Ako je x=" + x + " vrednost linearne funkcije je " + izracunajVrednost());
	}
	
	public void proveriRealneNule() {
		if (a != 0 ) {
			System.out.println("Linearna funkcija ima realne nule!");
		}
		else {
			System.out.println("Linearna funkcija nema realne nule!");
		}
	}
	
	public void izracunajNule() {
		x = -b / a;
	}
	
	public void upisiNule(String imeFajla) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileOutputStream(imeFajla));
				pw.print("Nula funkcije je " + x);
		}
		catch (IOException e){
			System.out.println(e.getMessage());
		}
		finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
}			
