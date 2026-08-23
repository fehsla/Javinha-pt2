package estruturaCondicional;

import java.util.Scanner;

public class EXERCICIO01 {
	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
		 * negativo ou não.
		 */
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a < 0) {
			System.out.println("NUMERO NEGATIVO");
		} else {
			System.out.println("NUMERO POSITIVO");
		}

		sc.close();
	}
}
