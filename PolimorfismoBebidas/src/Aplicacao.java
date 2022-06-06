
public class Aplicacao {

	public static void main(String[] args) { 

		Preparacao preparacao = new Preparacao(); //criação do objeto preparacao
		LeiteQuente leiteQuente = new LeiteQuente(); //criação de um novo objeto leiteQuente
		preparacao.prepararBebida(leiteQuente);  //o objeto preparação chama o método prepararBebida, que recebe o valor (objeto) leiteQuente
		//(que é a bebida que vai ser preparada)
		
		Refrigerante refrigerante = new Refrigerante();
		preparacao.prepararBebida(refrigerante);
		

	}

}
