import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Calculos calculos = new Calculos();
		
		System.out.println("Digite a altura do quadrado:");
		int x = scanner.nextInt();
		System.out.println("Digite a largura do quadrado:");
		int y = scanner.nextInt();
		
		System.out.println("Digite a altura do retângulo:");
		int xr = scanner.nextInt();
		System.out.println("Digite a largura do retângulo:");
		int yr = scanner.nextInt();

		System.out.println("Digite a altura do triângulo:");
		int xt = scanner.nextInt();
		System.out.println("Digite a largura do triângulo:");
		int yt = scanner.nextInt();
		System.out.println();
		
		
		int mult = calculos.mult(x, y);
		System.out.println("A área do quadrado é: " + mult);
		
		int multR = calculos.mult(xr, yr);
		System.out.println("A área do retângulo é: " + multR);
		
		int multT = calculos.mult(xt, yt);
		System.out.println("A área do triângulo é: " + multT); 

	}

}
