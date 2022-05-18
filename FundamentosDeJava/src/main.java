import java.util.Scanner;

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
//		for(int x = 0; x < 10; x++) {
//			System.out.println(x);
//		}
		
		//exerc�cio tabuada	
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("Digite um n�mero");
//		int y = entrada.nextInt();
//		
//		for(int x = 0; x < 10;  x++) {
//			System.out.println(y + " x " +  x  + " = " + x*y);
//		}
		
		//Programa 5 (array) - matriz
		//as matrizes (arrays) s�o um conjunto de valores agrupados
		
//		//sem matriz
//		int x1 = 3;
//		int y1 = 5;
//		int z1 = 7;
//		
//		System.out.println(x1);
//		System.out.println(y1);
//		System.out.println(z1);
//		System.out.println();
		
		//com matriz (usando int)
//		
//		int x[] = {3, 5, 7}; // [] = array(matriz)
//		
//		for (int num = 0; num < x.length; num++) {
//			System.out.println("Valor do �ndice " + num + " = " + x[num]);
//		}
//	
//		//com matriz (usando caractere)
//		String nome[] = {"Vinicius", "Rafael", "Aline"};
//		
//		for (int nome1 = 0; nome1 < nome.length; nome1++) {
//			System.out.println(nome[nome1]);
//			if (nome[nome1] == "Aline") {
//				System.out.println("O �ndice de Aline �: " + nome1);
//			}
//		}
//			
//		//matriz (com intera��o do us�ario)
//		int[] arrayInt = new int[5]; //[5] = cria��o de 5 espa�os (objetos) na m�moria, que v�o receber cinco valores do tipo int
//		String[] ArrayString = new String[4];
//		double[] ArrayDouble = new double[3];
//		
//		arrayInt[3] = 4; //aqui, voc� est� declarando que o valor 4 vai ficar na posi��o (�ndice) 3
//		
//		int[] numero = new int[6];
//		Scanner teclado = new Scanner(System.in);
//		
//		for (int num2 = 0; num2 < numero.length; num2++) { //length = atributo do array que identifica a quantidade de espa�os criados na mem�ria
//			System.out.println("Digite um n�mero qualquer");
//			numero[num2] = teclado.nextInt(); //aqui, voc� solicita que o usu�rio digite uma informa��o(nesse caso, um n�mero)
//		}
//		
//		for (int num2 = 0; num2 < numero.length; num2++) {
//			System.out.println("�ndice " + num2 + " = " + numero[num2]);
//		}
		
//		Object[] arrayObject = new Object[4]; //criando uma matriz do tipo object, voc� consegue inserir valores de qualquer tipo
//	
//		arrayObject[0] = 12;
//		arrayObject[1] = "Vinicius";
//		arrayObject[2] = 15.6;
//		arrayObject[3] = true;
//		
//		for (int num2 = 0; num2 < arrayObject.length; num2++) {
//			System.out.println("�ndice " + num2 + " = " + arrayObject[num2]);			
//	    }
//		
		//cria��o de duas matrizes (uma para linhas e outra para colunas)
		int[][] arrayBidirecional = new int[3][3]; 
		
		for (int linha = 0; linha < arrayBidirecional.length; linha++) {
			for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) {
				System.out.print("�ndice ["+linha+"]["+coluna+"] = " +
						arrayBidirecional[linha][coluna]+ " ");
			}
			System.out.println();
		}
			
    }

}
