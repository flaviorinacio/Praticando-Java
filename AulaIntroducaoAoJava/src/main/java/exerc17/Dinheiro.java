package exerc17;

public class Dinheiro implements TipoPagamento {

	@Override
	public void pagar(double valor) {
		System.out.println("Pagamento em Dinheiro");
		System.out.println("Não possui taxa de pagamento");
		System.out.println();

	}

}
