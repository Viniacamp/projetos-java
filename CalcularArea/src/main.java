import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Calculos calculos = new Calculos();
		
		System.out.println("Digite a altura do quadrado:");
		int x = scanner.nextInt();
		System.out.println("Digite a largura do quadrado:");
		int y = scanner.nextInt();
		
		System.out.println("Digite a altura do ret�ngulo:");
		int xr = scanner.nextInt();
		System.out.println("Digite a largura do ret�ngulo:");
		int yr = scanner.nextInt();

		System.out.println("Digite a altura do tri�ngulo:");
		int xt = scanner.nextInt();
		System.out.println("Digite a largura do tri�ngulo:");
		int yt = scanner.nextInt();
		System.out.println();
		
		
		int mult = calculos.mult(x, y);
		System.out.println("A �rea do quadrado �: " + mult);
		
		int multR = calculos.mult(xr, yr);
		System.out.println("A �rea do ret�ngulo �: " + multR);
		
		int multT = calculos.mult(xt, yt);
		System.out.println("A �rea do tri�ngulo �: " + multT); 

	}

}
