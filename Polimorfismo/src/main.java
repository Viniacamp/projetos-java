
public class main {

	public static void main(String[] args) {
		
		//Como a classe cachorro foi instânciada (apontada) para a classe Animal (superclasse), 
		//você consegue criar o objeto Cachorro na classe Animal
		Animal animal = new Cachorro(); 
		animal.falar();
		
		animal = new Gato();
		animal.falar();

	}

}
