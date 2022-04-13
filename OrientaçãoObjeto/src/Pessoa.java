
public class Pessoa {
	String nome;
	int numfig;
	
	void receber(int numfig) {
		this.numfig += numfig; 		
	}
	
	boolean dar(int numfig, Pessoa pessoa) {
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
