
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
		
//		a = (int)y; //nesse processo, temos o que � chamado de casting explicito (trocar de uma variavel para outra tendo perda de dados, j� q o espa�o de mem�ria da primeira � maior do que da segunda)  
//		b = x; //aqui j� acontece o que chamamos de casting implicito (trocar de uma variavel para outra sem ter perda de dados, j� que esta troca est� acontecendo de uma variavel com espa�o de mem�ria 
		//menor para outra maior)
		
//		System.out.println(a);
//		System.out.println(b);
		
		//Programa 2 (if-else)
		
//      	int idadepessoa = 65;
//		
//	    if(idadepessoa < 18) {
//			System.out.println("Voc� n�o pode beber");
//		}
//		else if (idadepessoa < 60) {
//			System.out.println("Bora l� na Antartica");
//		}
//		else {
//			System.out.println("Voc� est� muito velho para beber");
//		}
//		
//		System.out.println("Voc� tem " + idadepessoa + " anos");
//		
		//Programa 3 (switch-case)
		//Usando valores inteiros
		
//		int num = 5;
//		
//		switch (num) {
//		case 1:
//			System.out.println("Domingo");
//			break; //interrompe a execu��o do c�digo
//		case 2:
//			System.out.println("Segunda");
//			break;
//		case 3:
//			System.out.println("Ter�a");
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
//			System.out.println("S�bado");
//			break;
//		default:
//			System.out.println("Esse n�mero n�o representa um dia da semana");
//		}
		
		//usando um caractere (char)
		
//		char caractere = 'a'; //no caso do uso de um �nico caractere, usa-se aspas simples  
//		
//		switch(caractere) {
//			case 'a':
//				System.out.println("Seu caractere � a");
//				break;
//			case 'b':
//				System.out.println("Seu caractere � b");
//				break;
//			default:
//				System.out.println("Valor inv�lido");
//		}
		
		//usando um conjunto de caracteres (String)
		
//		String farol = "verde";
//		
//		switch(farol) {
//			case "vermelho":
//				System.out.println("Pare!!");
//				break;
//			case "amarelo":
//				System.out.println("Aten��o!!");
//				break;
//			case "verde":
//				System.out.println("Siga!!");
//				break;
//			default:
//				System.out.println("Valor inv�lido");
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
		
		//exerc�cio tabuada
		for(int x = 1; x < 10; ) {
			System.out.println(x);
		}
	}

}