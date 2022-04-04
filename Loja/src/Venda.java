
public class Venda {

	public static void main(String[] args) {
		double prod1 = 50;
        double prod2 = 20;
        double totalPagar;
        double desc;
        
        totalPagar = prod1 + prod2;
        desc = totalPagar * 0.85;
        System.out.println("O valor total a pagar é: R$ " + totalPagar);
        System.out.println("O valor total a pagar com desconto é: R$ " + desc);
        
	}

}
