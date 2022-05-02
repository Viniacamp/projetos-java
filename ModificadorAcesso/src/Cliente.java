import java.util.Objects;

public class Cliente {
	private String nome;
	private int cpf;
	private int numConta;
	
	public Cliente() {
		
	}

	public String getNome() { //o get serve para mostrar informa��es, enquanto o set serve para inserir informa��es
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

	@Override
	public String toString() {  //esse m�todo exibe todas as informa��es de uma vez s� 
		return "\n Cliente: \n Nome = " + nome + "\n CPF = " + cpf + "\n N�mero da conta = " + numConta;
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
