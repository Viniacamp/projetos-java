import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		Scanner conf = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		pessoa.setNome(conf.nextLine());
		
		System.out.println("Digite a sua idade:");
		pessoa.setIdade(Integer.parseInt(conf.nextLine()));
		
		System.out.println("Digite o seu sexo:");
		pessoa.setSexo(conf.nextLine());
		
		Endereco endereco = new Endereco();
		
		pessoa.setEndereco(new Endereco());
		System.out.println("Digite o seu endereço:");
		System.out.println();
		
		System.out.println("Rua:");
		endereco.setRua(conf.nextLine());
		
		System.out.println("Nº:");
		endereco.setNumero(Integer.parseInt(conf.nextLine()));
		
		System.out.println("Bairro:");
		endereco.setBairro(conf.nextLine());

	}

}
