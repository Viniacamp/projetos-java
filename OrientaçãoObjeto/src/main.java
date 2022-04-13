
public class main {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Vinicius";
		pessoa1.numfig = 1;
		
		pessoa1.receber(3);
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numfig);
		
		Pessoa pessoa2 = new Pessoa();
		
		pessoa2.nome = "Isabela";
		pessoa2.numfig= 2;
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numfig);
		
		boolean msg = pessoa1.dar(5, pessoa2);
		
		if(msg == true) {
			System.out.println();
			System.out.println(pessoa1.nome);
			System.out.println(pessoa1.numfig);
			System.out.println(pessoa2.nome);
			System.out.println(pessoa2.numfig);
		}
			
	}

}
