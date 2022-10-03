package exerc17;

public class Boleto implements TipoPagamento {

	@Override
	public void pagar(double valor) {
		System.out.println("Pagamento Boleto");
		System.out.println("Taxa fixa de 0,80");
		System.out.println();
	}

}
