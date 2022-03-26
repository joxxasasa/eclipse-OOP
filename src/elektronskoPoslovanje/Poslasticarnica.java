package elektronskoPoslovanje;

public class Poslasticarnica extends Prodavnica implements Imenovanje{
	private String imeKompanije;
	private String[] stavkeMenija = {
									"limunada",
									"coca-cola",
									"sampita",
									"krempita"							
									};
	
	public String pribaviImeProdavnice() {
		return imeKompanije;
		
	}
	
	public void postaviImeProdavnice(String imeProdavnice) {
		
	}
	
	@Override
	public String[] uzmiIzInventara() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void nabaviInventar(String artikal) {
		// TODO Auto-generated method stub

	}

}
