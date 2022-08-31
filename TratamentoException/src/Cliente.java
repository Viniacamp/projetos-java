
public class Cliente {
	private String nome;
	private int cpf;
	private ContaBancaria conta;
	

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", conta=" + conta + "]";
	}


	public Cliente(String nome, int cpf, ContaBancaria conta) {
		this.nome = nome;
		this.cpf = cpf;
		this.conta = conta;
	}

	public ContaBancaria getConta() {
		return conta;
	}


	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}


	public String getNome() { 
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


	
}
