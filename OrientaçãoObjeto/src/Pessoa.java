
public class Pessoa {
	String nome; //aqui, é criado a váriavel nome do tipo String
	int numfig;  //criação da variável numfig do tipo int
	
	void receber(int numfig) { //método receber recebe um valor void (vazio)
		this.numfig += numfig; //		
	}
	
	boolean dar(int numfig, Pessoa pessoa) { //método dar recebe um valor do tipo boolean
		boolean msg;
	
		if(this.numfig < numfig) {
			System.out.println("Figurinhas insuficientes");
			msg = false;
		} 
		
		else { 
			this.numfig -= numfig;
			pessoa.receber(numfig);
			msg = true;
	
		}
		
		return msg; 
  }
}
