
public class main {

	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria(1000.0, 100.0, 500.0);
		ContaBancaria conta2 = new ContaBancaria(3000.0, 350.0, 800.0);
		
		Cliente cliente1 = new Cliente("Vinicius", 151143285, conta1);
		Cliente cliente2 = new Cliente("Mariana", 148526759, conta2);
		
		//usando boolean (teste booleano)
		if(cliente1.getConta().sacar(100.0) == true) {
			System.out.println("Saque realizado com sucesso");
		}
		else {
			System.out.println("Operação não realizada");
			System.out.println("Saldo insuficiente");
		}
		System.out.println("Seu saldo atual é de " + cliente1.getConta().getSaldo());
	
		//usando magic numbers (MN)	
//		switch(cliente1.getConta().sacarMN(100.0)) {
//			case 100:
//				System.out.println("Saque realizado com sucesso");
//			case 101:
//				System.out.println("Saque realizado com sucesso, mas você está usando o seu limite");
//			case 102:
//				System.out.println("Operação não realizada");
//				System.out.println("Limite insuficiente");
//		}
	
		//usando exception (EX) 
//		try { //try = tenta executar o comando
//			cliente1.getConta().sacarEX(3000.0);
//		} catch (ContaException e) { //caso de erro, o catch vai pegar (coletar) o erro e mostra-lo na tela
//			e.printStackTrace(); //e = variavel que recebe o código de erro
//			System.out.println("Não foi possível realizar a operação: " + e.getMessage());
//		}
//		
	}
	
	
}
