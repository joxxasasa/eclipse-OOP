package elektronskoPoslovanje;

public class Picerija extends Prodavnica implements Imenovanje{
		private String imeKompanije;
		private String[] ponudaHrane = {
										"pivo",
										"sok",
										"pica margerita",
										"pica capricoza"							
										};
		
		Picerija() {}
		
		Picerija(String imeKompanije, int maxBrojKlijenata) {
			super(maxBrojKlijenata);
			this.imeKompanije = imeKompanije;
		}

		public String pribaviImeProdavnice() {
			return imeKompanije;
		}

		public void postaviImeProdavnice(String imeProdavnice) {
			this.imeKompanije = imeKompanije;
		}

		public String[] getPonudaHrane() {
			return ponudaHrane;
		}

		public void setPonudaHrane(String[] ponudaHrane) {
			this.ponudaHrane = ponudaHrane;
		}
		
		public void nabaviInventar(String artikal) {
			System.out.println("\nUpravo ste narucili artikal "
					+ artikal);
		}

		public String[] uzmiIzInventara() {
			return ponudaHrane;
		}
		
		
		
}
