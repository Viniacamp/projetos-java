
public class Triangulo implements AreaCalculavel {

	double ladoa;
	double ladob;
	
	@Override
	public void calcularArea() {
		ladoa = 3;
		ladob = 4;
		System.out.println("A area do tri�ngulo �: "+ (ladoa * ladob / 2));
		
	}

}
