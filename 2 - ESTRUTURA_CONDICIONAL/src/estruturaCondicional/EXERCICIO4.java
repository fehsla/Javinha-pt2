package estruturaCondicional;

import java.util.Scanner;

public class EXERCICIO4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("DIGITE A HORA INICIAL");
		int a = sc.nextInt();

		System.out.println("DIGITE A HORA FINAL");
		int b = sc.nextInt();

		int duracao;

		if (a < b) {
			duracao = b - a;
		} else {
			duracao = 24 - a + b;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();
	}
}
