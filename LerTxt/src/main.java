import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//o comando abaixo lê o conteúdo que está em um arquivo .txt e mostra na tela
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) {
			String line;
			String string = "";
			
			while((line = reader.readLine())!= null) { //readLine = comando que faz a leitura das linhas do arquivo
				string += line + "\n";
			}
			System.out.println(string);
		}
		
		//Exemplo sabonete (m�todo 1)
		Sabonete sabonete1 = new Sabonete("Vermelho", "Cereja");
		String s = sabonete1.toString(); 
		
		//m�todo 2
		String teste = "Sabonete: cor = Vermelho, cheiro = Cereja"; //texto atribuído a váriavel teste do tipo String
		
		Sabonete sabonete2 = new Sabonete(teste);
		
		System.out.println(sabonete2);
	
	}

}
