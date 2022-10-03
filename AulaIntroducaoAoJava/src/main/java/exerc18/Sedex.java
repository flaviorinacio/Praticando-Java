package exerc18;

public class Sedex implements Entrega {

	@Override
	public void entregar(String produto) {
		System.out.println("Entrega via sedex = "+ produto + " prazo de 24h");

	}

}
