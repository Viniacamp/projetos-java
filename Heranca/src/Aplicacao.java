
public class Aplicacao {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("Fiat");
		veiculo.setModelo("Uno");
		veiculo.setAno(1998);
		
		veiculo.imprimir();
		veiculo.buzinar();
		
		Carro carro = new Carro();
		
		System.out.println();
		
		carro.setMarca("Hyundai");
		carro.setModelo("HB20");
		carro.setAno(2018);
		carro.setQuatroPortas(true);
		
		carro.imprimir();
		carro.buzinar();
		
		Caminhao caminhao = new Caminhao();
		
		System.out.println();
		
		caminhao.setMarca("Renault");
		caminhao.setModelo("B350X");
		caminhao.setAno(2020);
		
		caminhao.imprimir();
		caminhao.buzinar();
		
		Moto moto = new Moto();
		
		System.out.println();
		
		moto.setMarca("Honda");
		moto.setModelo("450BX");
		moto.setAno(2019);
		
		moto.imprimir();
		moto.empinar();
		moto.buzinar();
		
	}

}
