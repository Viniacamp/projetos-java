
public class main { //criação da classe publica main (ou Aplicação), que é a classe primária do projeto, onde são declaradas as váriaveis necessárias para a execução do 
//programa

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(); //aqui, voce está chamando o construtor para criar um novo objeto pessoa1 da classe Pessoa
		
		//Declaração dos atributos para o objeto pessoa1
		pessoa1.nome = "Vinicius"; //aqui, o atributo nome de pessoa1 vai receber o valor "Vinicius" (tipo String) 
		pessoa1.numfig = 1; //já aqui, o atributo numfig vai receber o valor 1 (tipo int)
		
		pessoa1.receber(3); //atributo receber recebe o valor inteiro 3
		
		//System.out.println = comando utilizado para exibir (printar) um conteúdo na tela
		System.out.println(pessoa1.nome); //exibe o valor da variável (atributo) nome de pessoa1
		System.out.println(pessoa1.numfig); //exibe o valor da variável (atributo) numfig de pessoa1
		
		//mesmo processo só que realizado com outro objeto 
		Pessoa pessoa2 = new Pessoa();
		
		pessoa2.nome = "Isabela";
		pessoa2.numfig= 2;
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numfig);
		
		//boolean = tipo de dado que recebe dois valores: true - false (verdadeiro ou falso)
		boolean msg = pessoa1.dar(5, pessoa2); //aqui, você está declarando o número de figurinhas (numfig) que o método dar de pessoa1 vai subtrair do objeto
		//e transferir para o objeto pessoa2	
		//criação do atributo msg do tipo boolean
		
		if(msg == true) {//== - sinal utilizado no java para fazer comparações
			System.out.println();
			System.out.println(pessoa1.nome);
			System.out.println(pessoa1.numfig);
			System.out.println(pessoa2.nome);
			System.out.println(pessoa2.numfig);
		}
			
	}

}
