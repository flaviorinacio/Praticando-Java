package exerc17;

public class Vendas {
	public void vender(TipoPagamento pgto, double valor) {
		pgto.pagar(valor);
	}

}
