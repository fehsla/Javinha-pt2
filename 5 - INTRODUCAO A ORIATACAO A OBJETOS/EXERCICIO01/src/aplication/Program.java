package aplication;
import entities.math;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("INFORME ALTURA E LARGURA");
		math.largura = sc.nextDouble();
		math.altura = sc.nextDouble();
		
		System.out.println("AREA: " + math.area());
		System.out.println("PERIMETRO: " + math.perimetro());
		System.out.println("DIAGONAL: " + math.diagonal());
		
	}

}
