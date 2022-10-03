package exerc16;


public class AlhoBacon implements Pizza {

	@Override
	public void Preparar() {
		System.out.println("molho, alho e muito bacon");

	}

	@Override
	public void Assar() {
		System.out.println("14 min");

	}

	@Override
	public void Cobrar() {
		System.out.println("R$:15,50");

	}

}
