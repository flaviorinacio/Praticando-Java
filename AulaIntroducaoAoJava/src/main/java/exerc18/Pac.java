package exerc18;

public class Pac implements Entrega {

	@Override
	public void entregar(String produto) {
		System.out.println("Entrega via PAC = " + produto + " 15 dias de prazo");

	}

}
	