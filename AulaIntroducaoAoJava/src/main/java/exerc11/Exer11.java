package exerc11;

public class Exer11 {

	public static void main(String[] args) {

		Torcedor torcedor = new Torcedor();
		torcedor.torcer();

		// Polimorfismo
		torcedor = new Vasco();
		torcedor.torcer();

		torcedor = new Palmeiras();
		torcedor.torcer();

		torcedor = new Santos();
		torcedor.torcer();

	}

}
