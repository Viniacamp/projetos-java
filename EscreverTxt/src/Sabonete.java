
public class Sabonete {
	
	private String cor;
	private String cheiro;
	
	@Override
	public String toString() {
		return "Sabonete [cor = " + cor + ", cheiro = " + cheiro + "]\n";
	}

	//por meio dos métodos get e set
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCheiro() {
		return cheiro;
	}

	public void setCheiro(String cheiro) {
		this.cheiro = cheiro;
	}

	//por meio de um construtor
//	public Sabonete(String cor, String cheiro) {
//		super();
//		this.cor = cor;
//		this.cheiro = cheiro;
//	}
	
	
}
