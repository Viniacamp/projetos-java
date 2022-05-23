//os enums são utilizados para valores constantes
public enum DiaDaSemana {
	Domingo(1), Segunda(2), Terca(3), Quarta(4), Quinta(5), Sexta(6), Sabado(7); //criação de variáveis do tipo enum e atribuição de valores inteiros para essas
	//variaveis

		
	private int num; //criação da variável privada num (tipo int)

	private DiaDaSemana(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}
	
}
