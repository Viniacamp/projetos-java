
public class Main {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();
		quadrado.calcularArea(); //aqui o programa chama o método calcularArea do quadrado, que foi herdado da interface AreaCalculavel
		
		Retangulo retangulo = new Retangulo();
		retangulo.calcularArea(); //método calcularArea do retângulo
				
		Triangulo triangulo = new Triangulo();
		triangulo.calcularArea(); //método calcularArea do triângulo
		
	}

}
