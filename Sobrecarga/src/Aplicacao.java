import  java.util.Scanner; //comando que importa o scanner da pasta src do java

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //criação de um novo objeto scanner, que vai ser responsável por receber as
		//informações do usúario
		
		Matemática matematica = new Matemática(); 
		
		System.out.println("Somar dois números");
		System.out.println("Digite o primeiro número:");
		int x = scanner.nextInt(); //aqui o usúario vai inserir um valor do tipo inteiro, que vai ser atribuído para a váriavel x
		
		System.out.println("Digite o segundo número:");
		int y = scanner.nextInt(); //aqui o usúario vai inserir um valor que vai ser atribuído para a variável y 
		System.out.println();
		
		//aqui, o método somar vai ser responsável por realizar a soma dos valores das duas variáveis (x,y), em três situações:
		//com a utilização somente de valores inteiros, com a utilização de valores do tipo double (podendo receber valores inteiros
		//e decimais), e com o uso de um terceiro valor, representado pela variável z
		
		int soma = matematica.somar(x, y); //soma dos valores das duas variáveis, caso eles sejam valores do tipo inteiro
		System.out.println("O resultado é: " + soma);
		
		soma = matematica.somar(x, y, 5); //soma dos valores das duas variáveis + a soma de um terceiro valor (todos do tipo int)
		System.out.println("O resultado é: " + soma);
		
		double soma2 = matematica.somar(x, y); //soma dos valores das duas variáveis, caso os valores (ou um dos valores) seja decimal
		System.out.println("O resultado é: " + soma2); //mostra o resultado da operação na tela
		
 	}

}
