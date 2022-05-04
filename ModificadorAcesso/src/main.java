
public class main {

	public static void main(String[] args) {
		
//		ContaBancaria conta1 = new ContaBancaria(true, 3.0);
			
//		conta1.ativo = true;
//		conta1.numConta = 1234;
//		conta1.saldo = 100.50;
//
//		System.out.println(conta1.ativo);
//		System.out.println(conta1.numConta);
//		System.out.println("R$" + conta1.saldo);
		
//		conta1.receber(0);
//		conta1.dar(0);
//		conta1.saldo();
//		
//		System.out.println(conta1.saldo());
//
//		ContaBancaria conta2 = new ContaBancaria();
//		System.out.println(conta2.saldo());
		
		Cliente cliente1 = new Cliente();
				
		cliente1.setNome("Vinicius");
		cliente1.setCpf(121522362);
		cliente1.setNumConta(212362);
		
		System.out.println(cliente1);
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setNome("Pedro");
		cliente2.setCpf(965214326);
		cliente2.setNumConta(321025);
		
		System.out.println(cliente2);
		
		if (cliente1 == cliente2) { //== - serve para comparar objetos
			System.out.println("\n Os objetos são iguais"); // \n - pular linha
		}
		else {
			System.out.println("\n Os objetos são diferentes");
	    }
		
		
		if (cliente1.getNome() == cliente2.getNome()) {
			System.out.println(" Os nomes são iguais");
		}
		else {
			System.out.println(" Os nomes são diferentes");
		}

		
		if(cliente1.equals(cliente2)) { //serve para comparar atributos
			System.out.println(" Os atributos são iguais");
		}
		else {
			System.out.println(" Os atributos são diferentes");
		}
		
		
	}

}
