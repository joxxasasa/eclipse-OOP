package matematika;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class KvadratnaFunkcija implements Funkcija {
	double a, b, c, x1, x2, x;
	
	KvadratnaFunkcija() {}
	
	KvadratnaFunkcija(double x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	@Override
	public void ucitajParametre(String imeFajla) {
		Scanner s = null;
	try {
		s = new Scanner(new File(imeFajla));
			double a = s.nextDouble();
			double b = s.nextDouble();
			double c = s.nextDouble();
			this.a = a;
			this.b = b;
			this.c = c;
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
		return a * x * x + b * x + c;
	}
	
	public void stampajVrednosti() {
		System.out.println("Ako je x=" + x + " vrednost kvadratne funkcije je " + izracunajVrednost());
	}
	
	public void proveriRealneNule() {
		if ((b * b) - 4 *a *c > 0 ) {
			System.out.println("Kvadratna funkcija ima realne nule!");
		}
		else if ((b * b) - 4 *a *c == 0) {
			System.out.println("Kvadratna funkcija ima jednu realnu nulu!");
		}
		else {
			System.out.println("Kvadratna funkcija nema realne nule!");
		}
	}
	
	public void izracunajNule() {
		x1 = Math.round(-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		x2 = Math.round(-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	}
	
	@Override
	public void upisiNule(String imeFajla) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileOutputStream(imeFajla));
				pw.println("Nule funkcije su: " + x1 + " i " + x2);
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
		

