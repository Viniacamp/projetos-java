//os enums s�o utilizados para valores constantes
public enum DiaDaSemana {
	Domingo(1), Segunda(2), Terca(3), Quarta(4), Quinta(5), Sexta(6), Sabado(7); //cria��o de vari�veis do tipo enum e atribui��o de valores inteiros para essas
	//variaveis

		
	private int num; //cria��o da vari�vel privada num (tipo int)

	private DiaDaSemana(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}
	
}
