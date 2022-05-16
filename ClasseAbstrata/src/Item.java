
public abstract class Item {
//Em uma classe abstrata voc� consegue criar m�todos e atributos, por�m voc� n�o consegue criar
//objetos dentro dela
	private int posX; //posi��o (eixo) x
	private int posY; //posi��o (eixo) y
	
	public abstract void pegar();

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
		
}
