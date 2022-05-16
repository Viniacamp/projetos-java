
public class Retangulo implements AreaCalculavel {
	
	double ladoR;

	@Override
	public void calcularArea() {
		ladoR = 6;
		System.out.println("A area do retângulo é: "+ (ladoR * ladoR));
		
	}

	
	
}
