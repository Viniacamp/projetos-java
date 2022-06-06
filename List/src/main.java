//com a interface list, você consegue criar uma lista de elementos
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		//Programa 1
		List lista = new ArrayList();
		
		lista.add("Teste");
		lista.add(12);
		lista.add(true);
		
		//método 1 (desse método, você consegue limitar a busca dos dados)
		for(int x=0; x < lista.size(); x++) { 
			System.out.println(lista.get(x));
		}
		
		//método 2 (desse método, você acaba fazendo uma varredura completa dos dados,
		//puxando todos eles)
		System.out.println();
		lista.remove(0); //esse comando remove um valor da lista 
		//(nesse caso o valor Teste, que está na posição 0)
		for(Object valor : lista) { 
			System.out.println(valor);
		}
		
		System.out.println();
		lista.add(0, "def"); //esse comando adiciona um valor (def) a lista na posição 0
		for(Object valor : lista) { 
			System.out.println(valor);
		}
		
		System.out.println();
		lista.set(0, "ghi"); //esse comando sobrescreve (substitui) o valor anterior
		for(Object valor : lista) { 
			System.out.println(valor);
		}
		
		System.out.println();
		
		lista.clear(); //limpa a lista
		
		if (lista.isEmpty()) { //se a lista estiver vazia (sem dados), o programa vai executar
		//o comando que está abaixo
			System.out.println("Sua lista está vazia");
		}
		
		//Programa 2
		Conta conta1 = new Conta("Água", 60.00);
		Conta conta2 = new Conta("Luz", 120.00);
		
		List<Conta> listaDeContas = new ArrayList<Conta>(); //criação de uma nova lista da classe Conta intitulada listaDeContas
		
		//adição dos objetos conta1, conta2 a lista recem-criada  
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		
		for(Conta conta : listaDeContas) {
			System.out.println(conta);
		}
	}

}
