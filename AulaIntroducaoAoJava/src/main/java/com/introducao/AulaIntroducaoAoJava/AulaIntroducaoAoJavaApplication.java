package com.introducao.AulaIntroducaoAoJava;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaIntroducaoAoJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaIntroducaoAoJavaApplication.class, args);
// declarandos as variaveis
		int a = 10;
		int b = 20;
		int r = 0;
// somando os numeros
		r = a + b;
		// mostrando na tela
		System.out.println("Resultado:" + r);
		/*****************************************************************************************/
// declarando as variaveis
		Scanner leitor = new Scanner(System.in);
		int idade = 0;
		/*****************************************************************************************/
		System.out.print("Entre com sua idade: ");
		idade = leitor.nextInt();
// if e else
		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
		System.out.println("Imprimindo a idade digitada: " + idade);
		/*****************************************************************************************/
// Switch de condição
		System.out.println("Opção 1 - Expresso");
		System.out.println("Opção 2 - Cappuccino");
		System.out.println("Opção 3 - Macchiato");

		System.out.println("Escolha sua opção: ");
		int opcao = 0;
		opcao = leitor.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Expresso Escolhido");
			break;
		case 2:
			System.out.println("Cappuccino Escolhido");
			break;
		case 3:
			System.out.println("Macchiato Escolhido");
			break;
		default:
			break;
		}
		/*
		 * Quando precisamos escolher uma opção de caso que não senha numero, neste caso
		 * letra necessariamente precisamos colocar a letra entre aspas simples 'a'
		 * 
		 * exemplo: case 'a':
		 */
		/*****************************************************************************************/
// Laço de repetição
		int i = 0;
		while (i < 10) {
			i = i + 1;
			i += 1;
			i++;
			System.out.println(i);
		} // fim do while;
		for (int n = 0; n < 10; n++) {
			System.out.println(n);
		} // fim do for
		/*****************************************************************************************/
// Declaração de constantes
		/*
		 * Sempre escrer o nome da constante em letras MAIUSCULAS e quando é palavras
		 * usar _ no lugar de espaços.
		 */
		final int TAM = 5;
		/*****************************************************************************************/
		int[] vetor1 = { 1, 2, 3, 4 }; // declarando um vetor
		float[] vetor2 = new float[5];// declarando um vetor com tamanho definido
		char[] vetor3 = new char[TAM];// declarando um vetor com tamanho definido por uma contante
		/*****************************************************************************************/
//Matrix: tipo nome [l][c];
		int x = 0;
		int y = 0;
		int[][] matriz1 = new int[3][3];// declarando uma materiz
		int[][] matriz2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } }; // declarando uma materiz de 2 linhas e 3 colunas e já
															// povoando com valores
		matriz1[x][y] = 10;// adicionando um valor na materiz
		int variavel = matriz1[x][y];// lento um valor da materiz e colocando em uma variavel
		matriz1[x][y] = leitor.nextInt();// adicionando um valor na materiz a parte da entrada do usuario
		System.out.println(matriz1[x][y]);// imprimindo um valor que está uma materiz

		for (x = 0; x < 3; x++) {
			for (y = 0; y < 2; y++) {
				System.out.print(matriz2[x][y]);
			} // fim do for coluna(x)
			System.out.println();// pulando linha
		} // fim for linha(y) 
		/*****************************************************************************************/

	}// fim do main
}// fim da class AulaIntroducaoJavaApplication
