package lacorepeticao;

import java.util.Scanner;
import java.util.Locale;

public class do_while {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		do {
			System.out.print("DIGITE A TEMPERATURA EM CELSIUS");
			double c = sc.nextDouble();
			double f = 9.0 * c / 5.0 + 32;
			System.out.printf("EQUIVALENTE EM FAHRENHEIT: %.2f%n ", f);
			System.out.print("DESEJA REPETIR S/N");

			resp = sc.next().charAt(0);
		} while (resp != 'n');
		sc.close();

	}
}
