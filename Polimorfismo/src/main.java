
public class main {

	public static void main(String[] args) {
		
		//Como a classe cachorro (subclasse) foi instânciada (apontada) para a classe Animal (superclasse), 
		//você consegue criar o objeto Cachorro na classe Animal
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
		
		public static void falar(Animal a) { //a = é a váriavel que recebeu o endereço (localização) do objeto gato 
			a.falar();
			
			if(a instanceof Cachorro) { //esse comando compara as instâncias (verifica se o objeto é da classe declarada) 
				Cachorro c = (Cachorro) a; //c = váriavel que recebeu o endereço (localização) do objeto cachorro
				c.morder(); 
			}

		}

}
