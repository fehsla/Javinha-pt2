package entities;

public class math {
	/*
	 * fazer um programa para ler os valores da largura e altura de um retangulo. em
	 * seguida, mostrar na tela o valor de sua area, perimetro e diagonal. usar uma
	 * classe como mostrado no projeto ao lado
	 */
	
	public static double largura;
	public static double altura;

	public static double area() {
		return largura * altura;
	}
	
	public static double perimetro() {
		return ((largura * 2) + (altura * 2));
	}
	
	public static double diagonal() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2)); 
	}
}
