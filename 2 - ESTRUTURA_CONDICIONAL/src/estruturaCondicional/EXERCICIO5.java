package estruturaCondicional;

import java.util.Scanner;

public class EXERCICIO5 {
	public static void main(String[] args) {
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 */

		Scanner sc = new Scanner(System.in);

		// CACHORRO QUENTE
		// CHURRASCO
		// STROGONOFF

		int a = 3564;
		int b = 6574;
		int c = 3546;

		int cachorroQuente = 10;
		int churrasco = 100;
		int strogonoff = 30;

		System.out.println("DIGITE O CODIGO DO PRODUTO");
		int codigo = sc.nextInt();

		System.out.println("DIGITE A QUANTIDADE");
		int quantidade = sc.nextInt();

		if (codigo == a) {
			int x = cachorroQuente * quantidade;
			System.out.printf("O VALOR DO CACHORRO QUENTE E: %d%n", x);

		} else if (codigo == b) {
			int y = churrasco * quantidade;

			System.out.printf("O VALOR DO CHURRASCO É: %d%n", y);
		} else if (codigo == c) {
			int z = strogonoff * quantidade;
			System.out.printf("O VALOR DO STROGONOFF E: %d%n", z);
		} else {
			System.out.println("VALOR INVALIDO");
		}

		sc.close();

	}
}
