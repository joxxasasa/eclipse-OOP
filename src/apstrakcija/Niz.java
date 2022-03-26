package apstrakcija;
//Napisati Java kod za pretraživanje niza decimalnih brojeva. Tražena vrednost treba da je veæa od promenljive donjaGranica, 
//a manja do promenljive gornjaGranica. Kod treba da ispiše svaku vrednost koja zadovoljava dati uslov.
public class Niz {
	double [] Niz = new double[10];
	int N = 1, i;
	double donjaGranica, gornjaGranica;
	
	System.out.println("Unesite N:\t");
	N = TextIO.getlnInt();
	
	System.out.println("Unesite donju granicu:\t");
	donjaGranica = TextIO.getlndouble();
	
	System.out.println("Unesite N:\t");
	gornjaGranica = TextIO.getlndouble();
	
	for (i = 0; i < N; i++){ 
	System.out.println("Unesite " + (i+1) + ". element niza:\t");
	Niz[ i ] = TextIO.getlndouble();
	}
	
	for (i = 0; i < N; i++) {
		if (Niz[i] > donjaGranica && Niz[i] > gornjaGranica) {
			System.out.println(Niz[i]);
		}
	}
	
}
