
public class Pessoa {
	String nome; //aqui, � criado a v�riavel nome do tipo String
	int numfig;  //cria��o da vari�vel numfig do tipo int
	
	void receber(int numfig) { //m�todo receber recebe um valor void (vazio)
		this.numfig += numfig; //+= - operador de compara��o (mais ou igual)	
		//this = comando que permite que o m�todo acesse (aponte) para os atributos da classe  
	}
	
	boolean dar(int numfig, Pessoa pessoa) { //m�todo dar recebe um valor do tipo boolean
		boolean msg;
	
		if(this.numfig < numfig) {
			System.out.println("Figurinhas insuficientes");
			msg = false;
		} 
		
		else { 
			this.numfig -= numfig; //-= - menos ou igual
			pessoa.receber(numfig);
			msg = true;
	
		}
		
		return msg; //retorna o valor da vari�vel msg
  }
}
