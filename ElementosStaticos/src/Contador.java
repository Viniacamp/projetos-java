
public class Contador {
	
	private static int valor;

//	public Contador() { //usando métodos normais
//		this.valor = 1;
//	}
	
	static {
		valor = 4;
	}

	public static void incrementar() {
		valor ++;
	}
	
	public static int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}
