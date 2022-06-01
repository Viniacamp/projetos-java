import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner conf = new Scanner(System.in);

		int ncad = 0;
		List<Pessoa> listaDeCadastros = new ArrayList<Pessoa>();
		for (ncad = 0; ncad < 2; ncad++) {
			
			Pessoa pessoa = new Pessoa();

			System.out.println("Digite o seu nome:");
			pessoa.setNome(conf.nextLine());

			System.out.println("Digite a sua idade:");
			pessoa.setIdade(Integer.parseInt(conf.nextLine())); //o comando Integer.parseInt recebe um dado do tipo String 
			//e o converte para inteiro
	
			System.out.println("Digite o seu sexo:");
	
			System.out.println();
			System.out.println("Digite 1 para Masculino");
			System.out.println("Digite 2 para Feminino");
			
			int confsexo = 0;
			while(confsexo != 1 && confsexo != 2) { //&& - e, != - diferente de
			confsexo = Integer.parseInt(conf.nextLine());
				
				if (confsexo == 1) {
					pessoa.setSexo(Sexo.M);
				}
				else if (confsexo == 2){
					pessoa.setSexo(Sexo.F);
				}	
				else {
					System.out.println();
					System.out.println("Opção inválida");
				}
			
			}
			
			pessoa.setEndereco(new Endereco());
			System.out.println();
			System.out.println("Digite o seu endereço:");
			System.out.println();

			System.out.println("Rua:");
			pessoa.getEndereco().setRua(conf.nextLine());

			System.out.println("Nº:");
			pessoa.getEndereco().setNumero(Integer.parseInt(conf.nextLine()));

			System.out.println("Bairro:");
			pessoa.getEndereco().setBairro(conf.nextLine());
			System.out.println();
			
			listaDeCadastros.add(pessoa);					
		}
		
		for(Pessoa pessoa : listaDeCadastros) {
			System.out.println(pessoa);
		}
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("ListadeCadastros.txt"))) {
			for(Pessoa pessoa : listaDeCadastros) 
				escrever.write(pessoa.toString());
		}
    }
//	Sexo sexo = Sexo.valueOf(conf.nextLine());
}
