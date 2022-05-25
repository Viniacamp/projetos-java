import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) {
			String line;
			String string = "";
			
			while((line = reader.readLine())!= null) {
				string += line + "\n";
			}
			System.out.println(string);
		}
		
		//Exemplo sabonete (método 1)
		Sabonete sabonete1 = new Sabonete("Vermelho", "Cereja");
		String s = sabonete1.toString();
		
		//método 2
		String teste = "Sabonete: cor = Vermelho, cheiro = Cereja";
		
		Sabonete sabonete2 = new Sabonete(teste);
		
		System.out.println(sabonete2);
	
	}

}
