package exerc14;

public class Forno {

	public void fabricar(PizzaCalabreza calabreza) {
		calabreza.preparar();
		calabreza.assar();
		calabreza.cobrar();	
	}
	
	public void fabricar(PizzaNapolitana napolitana) {
		napolitana.preparacao();
		napolitana.assamento();
		napolitana.valor();	
	}
	
}
