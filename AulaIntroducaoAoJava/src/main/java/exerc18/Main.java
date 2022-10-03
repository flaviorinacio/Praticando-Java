package exerc18;

public class Main {

	public static void main(String[] args) {
		Compra dvd = new Compra(new Pac());
		dvd.comprar("Hobbit");
		
		Compra livro = new Compra(new Sedex());
		livro.comprar("Use Java");
		livro.comprar("Arvore que dá dinheiro");

	}

}
