
public class main {
	
	public static final double PI = 3.14; //criação da constante (variável) pública PI do tipo double

	public static void main(String[] args) {
		
		double pi = main.PI;
		
		DiaDaSemana hoje = DiaDaSemana.Segunda; //como há valores declaradas no enum, ele só aceita os valores que estão
		//declarados nele
		
		int num = DiaDaSemana.Segunda.getNum(); //o metodo getNum puxa o valor que foi atribuido para a variável Segunda 
		System.out.println(num);
		
		String s = "Terca";  
		hoje = DiaDaSemana.valueOf(s); //esse comando pega o valor atribuído para a variável s (Terca) e o compara com 
		//os valores presentes no enum DiaDaSemana, reconhecendo automaticamente a váriavel se a String inserida tiver
		//o mesmo valor que a variável de enum
		
		System.out.println(hoje.getNum()); //mostra o valor atribuído pra hoje na tela
		
	}

}
