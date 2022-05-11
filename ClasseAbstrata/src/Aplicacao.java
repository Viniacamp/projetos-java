
public class Aplicacao {

	public static void main(String[] args) {
		
		//Item item = new Item(); - Você não consegue instânciar objetos em uma classe abstrata, porém você consegue 
		//criar objetos de outras classes
		
		Item item = new Cogumelo();
		item.pegar();
		
		item = new Moeda();
		item.pegar();
		
		item = new Diamante();
		item.pegar();

	}

}
