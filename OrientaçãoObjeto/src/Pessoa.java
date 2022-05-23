
public class Pessoa {
	String nome; //aqui, � criado a v�riavel nome do tipo String
	int numfig;  //cria��o da vari�vel numfig do tipo int
	
	void receber(int numfig) { //m�todo receber recebe um valor void (vazio)
		this.numfig += numfig; //		
	}
	
	boolean dar(int numfig, Pessoa pessoa) { //m�todo dar recebe um valor do tipo boolean
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
