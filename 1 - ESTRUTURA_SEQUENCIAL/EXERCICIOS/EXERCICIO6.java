package java_aulas;
import java.util.Scanner;

public class EXERCICIO6 {
	public static void main(String[] args) {
		/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
			mostre:
			a) a área do triângulo retângulo que tem A por base e C por altura.
			b) a área do círculo de raio C. (pi = 3.14159)
			c) a área do trapézio que tem A e B por bases e C por altura.
			d) a área do quadrado que tem lado B.
			e) a área do retângulo que tem lados A e B.*/
	
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		double pi = 3.14159;
		
		double calculoT = a * c / 2;
		double calculoC = pi * (Math.pow(c, 2));
		double tp = ((a + b) * c)/ 2;
		double quadrado = Math.pow(b, 2);
		double retangulo = a * b;
		
		System.out.println("TRIANGULO: " + calculoT);
		System.out.println("CIRCULO: " + calculoC);
		System.out.println("TRAPEZIO: " + tp);
		System.out.println("QUADRADO: " + quadrado);
		System.out.println("RETANGULO: " + retangulo);
		
				
		
	
	}
}
