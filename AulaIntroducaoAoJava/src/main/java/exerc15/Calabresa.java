package exerc15;

public class Calabresa implements Pizza {

	@Override
	public void Preparar() {
		System.out.println("molho, queijo, cebola e tomate");
	}

	@Override
	public void Assar() {
		System.out.println("15 min");

	}

	@Override
	public void Cobrar() {
		System.out.println("R$:12,00");

	}

}
