
public abstract class Item {
//Em uma classe abstrata você consegue criar métodos e atributos, porém você não consegue criar
//objetos dentro dela
	private int posX; //posição (eixo) x
	private int posY; //posição (eixo) y
	
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
