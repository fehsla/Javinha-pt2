package estruturaCondicional;

import java.util.Scanner;

public class switchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		switch (x) {
		case 1: {
			System.out.println("DOMINGO");
			break;
		}
		case 2: {
			System.out.println("SEGUNDA");
			break;
		}
		case 3: {
			System.out.println("TERCA");
			break;
		}
		case 4: {
			System.out.println("QUARTA");
			break;
		}
		case 5: {
			System.out.println("QUINTA");
			break;
		}
		case 6: {
			System.out.println("SEXTA");
			break;
		}
		case 7: {
			System.out.println("SABADO");
			break;
		}
		default:
			System.out.println("VALOR INVALIDO");
		}
	}
}
