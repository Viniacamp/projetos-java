
public class Quadrado implements AreaCalculavel{
	
	double ladoQ;
	
	@Override
	public void calcularArea() {
		ladoQ = 2;
		System.out.println("A area do quadrado é: "+ (ladoQ * ladoQ));
		
	}
		
}
