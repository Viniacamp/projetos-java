
public class main {

	public static void main(String[] args) {
		
		//Como a classe cachorro (subclasse) foi inst�nciada (apontada) para a classe Animal (superclasse), 
		//voc� consegue criar o objeto Cachorro na classe Animal
//		Animal animal = new Cachorro(); 
//		animal.falar();
//		
//		animal = new Gato();
//		animal.falar();
		
		Gato gato = new Gato();
		Cachorro cachorro = new Cachorro();
		falar(gato);
		falar(cachorro);
	}
		
		public static void falar(Animal a) { //a = � a v�riavel que recebeu o endere�o (localiza��o) do objeto gato 
			a.falar();
			
			if(a instanceof Cachorro) { //esse comando compara as inst�ncias (verifica se o objeto � da classe declarada) 
				Cachorro c = (Cachorro) a; //c = v�riavel que recebeu o endere�o (localiza��o) do objeto cachorro
				c.morder(); 
			}

		}

}
