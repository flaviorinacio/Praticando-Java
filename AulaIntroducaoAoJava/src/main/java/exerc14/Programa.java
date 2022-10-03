package exerc14;

public class Programa {

	public static void main(String[] args) {
		Forno forno = new Forno();

		PizzaCalabreza calabreza = new PizzaCalabreza();
		forno.fabricar(calabreza);

		PizzaNapolitana napolitana = new PizzaNapolitana();
		forno.fabricar(napolitana);
	}

}
