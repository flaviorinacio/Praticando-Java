package exerc17;

public class CartaoCredito implements TipoPagamento {

	@Override
	public void pagar(double valor) {
		double taxa = valor * 0.2;
		System.out.println("Pagamento Cartão de Crédito:");
		System.out.println("Taxa de pagamento de 2% da transação: R$:" + taxa);
		System.out.println();

	}

}
