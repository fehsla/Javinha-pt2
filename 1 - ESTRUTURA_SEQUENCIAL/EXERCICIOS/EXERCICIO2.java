package java_aulas;

import java.util.Scanner;

public class EXERCICIO2 {
	public static void main(String[] args) {
		double pi = 3.14159;
		double raio;

		/* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		casas decimais conforme exemplos.
		
		Fórmula da área: area = π . raio2
		Considere o valor de π = 3.14159  */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor do raio da circunferencia a ser calculo");
		
		raio = sc.nextDouble();
		
		
		double raioElev = Math.pow(raio, 2);
		double calculo  = pi * raioElev;
		
		System.out.println("O valor calculado é: " + calculo);
		
		
	}
}
