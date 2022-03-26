package singleton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.pribaviInstancu();
		Singleton s2 = Singleton.pribaviInstancu();
		Singleton s3 = Singleton.pribaviInstancu();
		
		s1.pribaviInstancu().stampajS();
		s2.pribaviInstancu().stampajS();
		s3.pribaviInstancu().stampajS();
		
		s1.s = (s1.s).toUpperCase();
		s2.s = (s1.s).toLowerCase();
		s1.pribaviInstancu().stampajS();
		
	}

}
