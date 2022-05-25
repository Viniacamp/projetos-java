import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String valor;
		
		Scanner conf = new Scanner(System.in);
		
		System.out.println("Digite alguma coisa:");
		valor = conf.nextLine();
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("entradasaída.txt"))) {
			escrever.write(valor);
		}
		
		try(BufferedReader reader = new BufferedReader(new FileReader("entradasaída.txt"))) {
			String line;
			String string = "";
			
			while((line = reader.readLine())!= null) {
				string += line + "\n";
			}
			
			System.out.println();
			System.out.println(string);
		}
		
	}

}
