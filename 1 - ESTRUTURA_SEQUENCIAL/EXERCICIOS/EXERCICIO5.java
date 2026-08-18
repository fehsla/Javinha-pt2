package java_aulas;

import java.util.Scanner;

public class EXERCICIO5 {
	public static void main(String[] args) {
		/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("DIGITE O COD DA PECA 01");
		int cod1 = sc.nextInt();
		System.out.println("DIGITE A QUANTIDADE(NUMERO) DA PECA 01");
		int num1 = sc.nextInt();
		System.out.println("DIGITE O VALOR R$ DA PECA 01");
		double valor1 = sc.nextDouble();
		
		System.out.println("-------------------------------------");
		
		System.out.println("DIGITE O COD DA PECA 02");
		int cod2 = sc.nextInt();
		System.out.println("DIGITE A QUANTIDADE(NUMERO) DA PECA 02");
		int num2 = sc.nextInt();
		System.out.println("DIGITE O VALOR R$ DA PECA 02");
		double valor2 = sc.nextDouble();
		
		double calculo1 = num1 * valor1;
		double calculo2 = num2 * valor2;
		
		double total = calculo1 + calculo2;
		
		System.out.println("VALOR TOTAL A PAGAR: R$ " + total);
		
		//agr eu era um louco a perguntar oq a vida ira fazer de mimmmmmmmmmmm 
		//sorrirrrrrr p nao chorarrrrr

		
		
	}
}
