
public class main {
	
	public static final double PI = 3.14; //cria��o da constante (vari�vel) p�blica PI do tipo double

	public static void main(String[] args) {
		
		double pi = main.PI;
		
		DiaDaSemana hoje = DiaDaSemana.Segunda; //como h� valores declaradas no enum, ele s� aceita os valores que est�o
		//declarados nele
		
		int num = DiaDaSemana.Segunda.getNum(); //o met�do getNum puxa o valor que foi atribuido para a vari�vel Segunda 
		System.out.println(num);
		
		String s = "Terca";  
		hoje = DiaDaSemana.valueOf(s); //esse comando pega o valor atribu�do para a vari�vel s (Terca) e o compara com 
		//os valores presentes no enum DiaDaSemana, reconhecendo automaticamente a v�riavel se a String inserida tiver
		//o mesmo valor que a vari�vel de enum
		
		System.out.println(hoje.getNum());
		
	}

}
