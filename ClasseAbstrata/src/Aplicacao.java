
public class Aplicacao {

	public static void main(String[] args) {
		
		//Item item = new Item(); - Voc� n�o consegue inst�nciar objetos em uma classe abstrata, por�m voc� consegue 
		//criar objetos de outras classes
		
		Item item = new Cogumelo();
		item.pegar();
		
		item = new Moeda();
		item.pegar();
		
		item = new Diamante();
		item.pegar();

	}

}
