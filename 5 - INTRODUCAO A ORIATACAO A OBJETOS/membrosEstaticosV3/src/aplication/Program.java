package aplication;

import java.util.Locale;
import java.util.Scanner;

import utilities.Calculator;
//DENTRO DA CLASSE PRINCIAL DO PROGRAMA UTILIZAR STATIC POR OBRIGACAO
public class Program {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira do raio");

		double radius = sc.nextDouble();

		double c = Calculator.circunference(radius);

		double v = Calculator.volume(radius);

		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", Calculator.PI);

		sc.close();
	}

}
