package bob;

public class PriBaba {

	public static void main(String[] args) {
		
		Pot gurne = new Pot();
		
		Baba baba = new Baba(gurne);
		Vnuche vnuche = new Vnuche(gurne);
		Vnuche vnuche2 = new Vnuche(gurne);
		vnuche.setName("Vnuche1");
		vnuche2.setName("Vnuche2");
		
		baba.start();
		vnuche.start();
		vnuche2.start();
		
	}
}
