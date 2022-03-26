package restoran;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Jelovnik implements RadSaJelovnikom{
	ArrayList<Jelo> listaJela;
	
	Jelovnik() {}
	
	Jelovnik(ArrayList<Jelo> listaJela) {
		this.listaJela = new ArrayList<Jelo>();
	}

	@Override
	public void dodajJelo(Jelo j) {
		listaJela.add(j);
		
	}

	@Override
	public Jelo pronadjiJelo(String naziv) {
		Jelo j = null;
		for (int i = 0; i < listaJela.size(); i++) 
			if(listaJela.get(i).getNaziv().equals(naziv)) 
				j = listaJela.get(i);
			return j;	
	}

	@Override
	public void obrisiJelo(String naziv) {
		Jelo j = pronadjiJelo(naziv);
		if (j != null) {
			listaJela.remove(j);
		
	}
}
	public void stampajListu() {
		System.out.println(Arrays.toString(this.listaJela.toArray()));
	}

	@Override
	public void ucitajJelovnik() {
		Scanner sc = null;
		ArrayList<Jelo> listaJela = new ArrayList<Jelo>();
		try {
			sc = new Scanner(new FileReader("Menu.txt"));
			do {
			String naziv = sc.next();
			String tip = sc.next();
			double cena = sc.nextDouble();
			Jelo j = new Jelo(naziv, tip, cena);
			listaJela.add(j);
		} while (sc.hasNext());		
	}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			if (sc != null)
				sc.close();
		}
		this.listaJela = listaJela;	
	}
}