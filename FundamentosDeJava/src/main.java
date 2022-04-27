
public class main {

	public static void main(String[] args) {
		
		//Programa 1 (troca de variaveis)
		
//		int x = 100;
//		double y = 200;
//		
//		int a = 0;
//		double b = 0;
//		short z = (short) 10000;
//		System.out.println(z);
		
//		a = (int)y; //nesse processo, temos o que é chamado de casting explicito (trocar de uma variavel para outra tendo perda de dados, já q o espaço de memória da primeira é maior do que da segunda)  
//		b = x; //aqui já acontece o que chamamos de casting implicito (trocar de uma variavel para outra sem ter perda de dados, já que esta troca está acontecendo de uma variavel com espaço de memória 
		//menor para outra maior)
		
//		System.out.println(a);
//		System.out.println(b);
		
		//Programa 2 (if-else)
		
//      	int idadepessoa = 65;
//		
//	    if(idadepessoa < 18) {
//			System.out.println("Você não pode beber");
//		}
//		else if (idadepessoa < 60) {
//			System.out.println("Bora lá na Antartica");
//		}
//		else {
//			System.out.println("Você está muito velho para beber");
//		}
//		
//		System.out.println("Você tem " + idadepessoa + " anos");
//		
		//Programa 3 (switch-case)
		//Usando valores inteiros
		
//		int num = 5;
//		
//		switch (num) {
//		case 1:
//			System.out.println("Domingo");
//			break; //interrompe a execução do código
//		case 2:
//			System.out.println("Segunda");
//			break;
//		case 3:
//			System.out.println("Terça");
//			break;
//		case 4:
//			System.out.println("Quarta");
//			break;
//		case 5:
//			System.out.println("Quinta");
//			break; 
//		case 6:
//			System.out.println("Sexta");
//			break;
//		case 7:
//			System.out.println("Sábado");
//			break;
//		default:
//			System.out.println("Esse número não representa um dia da semana");
//		}
		
		//usando um caractere (char)
		
//		char caractere = 'a'; //no caso do uso de um único caractere, usa-se aspas simples  
//		
//		switch(caractere) {
//			case 'a':
//				System.out.println("Seu caractere é a");
//				break;
//			case 'b':
//				System.out.println("Seu caractere é b");
//				break;
//			default:
//				System.out.println("Valor inválido");
//		}
		
		//usando um conjunto de caracteres (String)
		
//		String farol = "verde";
//		
//		switch(farol) {
//			case "vermelho":
//				System.out.println("Pare!!");
//				break;
//			case "amarelo":
//				System.out.println("Atenção!!");
//				break;
//			case "verde":
//				System.out.println("Siga!!");
//				break;
//			default:
//				System.out.println("Valor inválido");
//		}
		
		//Programa 4 (while, do-while, for)
		
		//while
//		int x = 0;
//		while(x < 10) {
//			System.out.println(x);
//			x = x + 1 ;
//		}
		
		//do-while
//		do {
//			System.out.println(x);
//			x = x + 1;
//		}
//		while (x < 10);

		//for
		//*funciona somente para valores*"
		for(int x = 0; x < 10; x++) {
			System.out.println(x);
		}
		
		//exercício tabuada
		for(int x = 1; x < 10; ) {
			System.out.println(x);
		}
	}

}
