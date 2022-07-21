package fundamentos;

import java.util.Scanner;

public class ProgramaRevisao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Programa 1
		
		double x;
		
		Pessoa pessoa1 = new Pessoa();
		
		System.out.println("Programa de cadastro");
		System.out.println();
		System.out.println("Digite o seu nome:");
		pessoa1.setNome(entrada.next ());
		System.out.println("Digite o seu endereço:");
		pessoa1.setEndereco(entrada.next());
		System.out.println("Digite a sua idade:");
		pessoa1.setIdade(Integer.parseInt(entrada.next()));
		System.out.println("Digite o seu telefone:");
		pessoa1.setTelefone(Integer.parseInt(entrada.next()));
		System.out.println("Digite o seu salário:");
		pessoa1.setSalario(entrada.nextDouble());
		
		Pessoa pessoa2 = new Pessoa();
		
		System.out.println();
		System.out.println("Digite o seu nome:");
		pessoa2.setNome(entrada.next());
		System.out.println("Digite o seu endereço:");
		pessoa2.setEndereco(entrada.next());
		System.out.println("Digite a sua idade:");
		pessoa2.setIdade(Integer.parseInt(entrada.next()));
		System.out.println("Digite o seu telefone:");
		pessoa2.setTelefone(Integer.parseInt(entrada.next()));
		System.out.println("Digite o seu salário:");
		pessoa2.setSalario(entrada.nextDouble());
		
		if (pessoa1.salario < pessoa2.salario) {
			x = pessoa2.getSalario() - pessoa1.getSalario();
			System.out.println();
			System.out.println("A diferença entre os dois salários é de: R$ " + x);
		}
	    else if (pessoa1.salario > pessoa2.salario) {
			x = pessoa1.getSalario() - pessoa2.getSalario();
			System.out.println();
			System.out.println("A diferença entre os dois salários é de: R$ " + x);
	    }
		
		//Programa 2
		
//		double r;
//		double valor;
//		double valordesc;
//		double desc;
//		
//		valor = 1500;
//		desc = 0.15;
//		
//	    r = valor * desc;
//	    valordesc = valor - r;
//	    
//	    System.out.println("O valor total com o desconto é de: R$ " + valordesc);
//	    System.out.println("O valor do desconto é de: R$ " + r);
	    
	    //Programa 3
	    
//	    Produto produto = new Produto();
//	    
//	    System.out.println("Programa de cadastro de produtos");
//	    System.out.println();
//	    System.out.println("Digite o nome do produto:");
//	    produto.setNome(entrada.nextLine());
//	    System.out.println("Digite a marca do produto:");
//		produto.setMarca(entrada.nextLine());
//		System.out.println("Digite o valor do produto:");
//		produto.setPreco(entrada.nextDouble());
//		System.out.println();
//		
//		System.out.println(produto);	
		
	}

}
