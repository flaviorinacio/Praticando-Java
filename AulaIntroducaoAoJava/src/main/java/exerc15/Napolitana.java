package exerc15;

public class Napolitana implements Pizza {

	@Override
	public void Preparar() {
		System.out.println("molho, presunto, queijo, tomate e oregano");

	}

	@Override
	public void Assar() {
		System.out.println("19 min");

	}

	@Override
	public void Cobrar() {
		System.out.println("R$:18,00");

	}

}
