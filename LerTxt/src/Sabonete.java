
public class Sabonete {
	
	private String cor;
	private String cheiro;
	
	@Override
	public String toString() {
		return "Sabonete: cor = " + cheiro + ", cheiro = " + cor + "\n";
	}
	
	public Sabonete(String cor, String cheiro) {
		this.cor = cor;
		this.cheiro = cheiro;
	}
	
	public Sabonete(String texto) {
		
		String[] arrayAuxiliar1 = texto.split(","); //o comando split quebra (divide) o conteúdo na String indicada (nesse caso, a partir da vírgula)
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
		this.cheiro = arrayAuxiliar2[1].trim(); //já o trim corta parte do conteúdo selecionado, excluindo-o 
		
		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.cor = arrayAuxiliar3[1].trim();
		
	}
	
}
