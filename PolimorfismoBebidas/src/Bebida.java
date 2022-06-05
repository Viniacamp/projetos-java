
public class Bebida {
	private String nome;
	private boolean aquecer;
	
	//aqui, o método analisa o nome da bebida e diz se ela precisa ser aquecida ou não
	public Bebida(String nome, boolean aquecer) {
		super();
		this.nome = nome;
		this.aquecer = aquecer;
	}
	
	
	public void preparar() { 
		System.out.println("Pegar copo");
	}
	
	
	public String getNome() { 
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAquecer() {
		return aquecer;
	}

	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}
	
	
	
}
