
public abstract class Item {
//Em uma classe abstrata você consegue criar métodos e atributos dentro dela, porém você não consegue implementa-la
//(criar objetos dela)
	private int posX;
	private int posY;
	
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
