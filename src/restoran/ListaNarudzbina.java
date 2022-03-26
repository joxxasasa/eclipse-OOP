package restoran;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class ListaNarudzbina implements RadSaNarudzbinama{
	ArrayList<Narudzbina> listaNarudzbina;
	
	ListaNarudzbina() {}

	public ListaNarudzbina(ArrayList<Narudzbina> listaNarudzbina) {
		this.listaNarudzbina = new ArrayList<Narudzbina>();
	}

	@Override
	public void dodajNarudzbinu(Narudzbina n) {
		listaNarudzbina.add(n);
		
		
	}

	@Override
	public void obrisiNarudzbinu(String idNarudzbine) {
		Narudzbina n = pronadjiNarudzbinu(idNarudzbine);
		if (n != null) {
			listaNarudzbina.remove(n);
		}
		
	}

	@Override
	public Narudzbina pronadjiNarudzbinu(String idNarudzbine) {
		Narudzbina n = null;
		for (int i = 0; i < listaNarudzbina.size(); i++) 
			if (listaNarudzbina.get(i).getIdNarudzbine().equals(idNarudzbine))
				n = listaNarudzbina.get(i);
			return n;
	}
	
	public void stampajListu() {
		//System.out.println(this.listaNarudzbina);
		System.out.println(Arrays.toString(this.listaNarudzbina.toArray()));
	}
	
	public Narudzbina napraviNarudzbinu(String idNarudzbine, Klijent narucilac, Jelo jelo, boolean realizovana) {
		Narudzbina n = new Narudzbina(idNarudzbine, narucilac, jelo, realizovana);
		System.out.print(n);
		return n;
	}
	
	public void upisiNarudzbinu(String imeFajla) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileOutputStream(imeFajla));
				pw.println("Narudzbine");
				pw.print(this.listaNarudzbina);
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
