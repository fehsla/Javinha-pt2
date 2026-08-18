package java_aulas;

import java.util.Scanner;

public class EXERCICIO3 {
	public static void main(String[] args) {
		/*
		 * 
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		*/
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		System.out.print("INSIRA OS VALORES DE CADA VARIAVEL PARA SER CALCULADO A DIFERENCA DOS PRODUTOS : ");
		a = sc.nextInt();	
		b = sc.nextInt();		
		c = sc.nextInt();		
		d = sc.nextInt();	
		
		int diferenca = ((a*b) - (c*d));
		
		System.out.println("A diferença dos produtos é: " + diferenca);

	}
}
