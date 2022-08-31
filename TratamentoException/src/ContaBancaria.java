
public class ContaBancaria {
	
	private double saldo;
	private double limite;
	private double valor;
	
	public ContaBancaria(double saldo , double valor, double limite) {
		this.saldo = saldo;
		this.valor = valor;
		this.limite = limite;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//usando boolean (testes booleanos)
	public boolean sacar(double valor) {
		if(this.saldo < valor) {
			return false;
		}
		this.saldo -= valor;
			return true;
	}
	
	public boolean transferir(Cliente cliente, double valor) {
		if(this.saldo < valor) {
			return false;
		}
		this.saldo -= valor;
		cliente.getConta().depositar(valor);
		return true;
	}
	
	
	//usando magic numbers (MN)
	public int sacarMN (double valor) {
		if((this.saldo < valor) && (this.saldo >= limite* -1)) {
			return 101;
		}
		else if(this.saldo >= limite* -1) {
			return 102;
		}
		return 100;
	}
	
	
	public int transferirMN(Cliente cliente, double valor) {
		if((this.saldo < valor) && (this.saldo >= limite* -1)) {
			this.saldo -= valor;
			return 101;
		}
		else if((this.saldo < valor) && (this.saldo >= limite* -1)) {
			return 102;
		}
		this.saldo -= valor;
		cliente.getConta().depositar(valor);
		return 100;
	}
	
	//usando exception (EX) 
		public void sacarEX(double valor) throws ContaException {
			if(this.saldo < valor) {
				throw new ContaException("Saldo insuficiente");
			}
			else if ((this.saldo - valor) < limite * -1) {
				throw new ContaException("Limite insuficiente");
			}
			this.saldo -= valor;	
	}
		
}
