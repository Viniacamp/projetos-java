
public class Main {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();
		quadrado.calcularArea(); //aqui o programa chama o m�todo calcularArea do quadrado, que foi herdado da interface AreaCalculavel
		
		Retangulo retangulo = new Retangulo();
		retangulo.calcularArea(); //m�todo calcularArea do ret�ngulo
				
		Triangulo triangulo = new Triangulo();
		triangulo.calcularArea(); //m�todo calcularArea do tri�ngulo
		
	}

}
