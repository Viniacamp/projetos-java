import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
	
		
		//por meio dos métodos get e set
		Sabonete sabonete1 = new Sabonete();
		
		sabonete1.setCor("Azul");
		sabonete1.setCheiro("Lavanda");
		
		Sabonete sabonete2 = new Sabonete();
		
		sabonete2.setCor("Verde");
		sabonete2.setCheiro("Erva Doce");
	
		//por meio de construtores
		
//		Sabonete sabonete1 = new Sabonete("Azul", "Lavanda");
//		Sabonete sabonete2 = new Sabonete("Verde", "Erva Doce");
		
		List<Sabonete> listSab = new ArrayList<Sabonete>();
		
		listSab.add(sabonete1);
		listSab.add(sabonete2);
		
		//o comando abaixo escreve (grava) dados em um arquivo .txt
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("Saída.txt"))) {
			for(Sabonete sabonete : listSab) 
				escrever.write(sabonete.toString());
		}
	}           
}
