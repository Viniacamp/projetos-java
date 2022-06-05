import java.util.Objects;

public class Cliente {
	private String nome;
	private int cpf;
	private int numConta;
	
	public Cliente() {
		
	}
	
	//aqui, há a criação dos métodos get e set; métodos que vão fazer com que outras classes consigam acessar e atribuir valores a atributos privados
	public String getNome() { //o get serve para acessar informações (valores) da variável, enquanto o set serve para atribuir valores a variável
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	@Override //o Override sobreescreve um método, em vez de criar um novo
	public String toString() {  //esse método exibe todas as informações de uma vez só 
		return "\n Cliente: \n Nome = " + nome + "\n CPF = " + cpf + "\n Número da conta = " + numConta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, numConta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cpf == other.cpf && Objects.equals(nome, other.nome) && numConta == other.numConta;
	}
	
}
