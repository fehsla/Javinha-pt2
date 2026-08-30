package lacorepeticao;

import java.util.Scanner;

public class EXERCICIO2 {
	public static void main(String[] args) {

		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma).
		 */
		Scanner sc = new Scanner(System.in);

		int x;
		int y;

		System.out.println("DIGITE O VALOR DE X");
		x = sc.nextInt();

		System.out.println("DIGITE O VALOR DE Y");
		y = sc.nextInt();

		while (x != 0 & y != 0) {

			if (x > 0 & y > 0) {
				System.out.println("Q1");
			} else if (x < 0 & y > 0) {
				System.out.println("Q2");
			} else if (x < 0 & y < 0) {
				System.out.println("Q3");
			} else if (y < 0 & x > 0) {
				System.out.println("Q4");
			}

			System.out.println("DIGITE O VALOR DE X");
			x = sc.nextInt();
			System.out.println("DIGITE O VALOR DE Y");
			y = sc.nextInt();

		}
		sc.close();
	}
}
