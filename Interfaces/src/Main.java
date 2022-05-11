
public class Main {

	public static void main(String[] args) {
		
		Rota rota = new Rota();
		
		//exemplo Automovel - exemplo 1
		Ferrari ferrari = new Ferrari();
		Fusca fusca = new Fusca();
		
		rota.ir(ferrari);
		rota.ir(fusca);
		
		//exemplo 2
		Automovel automovel = new Ferrari ();
		rota.ir(automovel);
		automovel = new Fusca();
		rota.ir(automovel);
		
		
		//exemplo ItemCaro (Vendedor, Apartamento)
		Vendedor vendedor = new Vendedor();
		Apartamento apartamento = new Apartamento();
		vendedor.mostrarPreco(apartamento);
		vendedor.mostrarPreco(ferrari);

	}

}
