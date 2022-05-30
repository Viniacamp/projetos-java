
public enum Sexo {
	M(1), F(2);

	private int num;

	private Sexo (int num) {
		this.num = num;
	}
	
	private int getNum() {
		return num;
	}
		
}