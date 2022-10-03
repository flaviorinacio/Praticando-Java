package exerc17;

public class Main {

	public static void main(String[] args) {
		Vendas venda = new Vendas();

		venda.vender(new Dinheiro(), 100.00);
		venda.vender(new CartaoCredito(), 100.00);
		venda.vender(new Boleto(), 100.00);
	}

}
