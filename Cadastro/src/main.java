import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();

		Scanner conf = new Scanner(System.in);

		int ncad = 0;
		List<Pessoa> listaDeCadastros = new ArrayList<Pessoa>();
		for (ncad = 0; ncad < 2; ncad++) {

			System.out.println("Digite o seu nome:");
			pessoa.setNome(conf.nextLine());

			System.out.println("Digite a sua idade:");
			pessoa.setIdade(Integer.parseInt(conf.nextLine()));

			System.out.println("Digite o seu sexo:");
			pessoa.setSexo(conf.nextLine());

			pessoa.setEndereco(new Endereco());
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
		
		for(Pessoa pessoa1 : listaDeCadastros) {
			System.out.println(pessoa1);
		}
	
    }
}
