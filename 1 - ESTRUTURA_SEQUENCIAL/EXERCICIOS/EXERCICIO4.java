package java_aulas;
import java.util.Scanner;

public class EXERCICIO4 {
	public static void main(String[] args) {
		/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		decimais.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE O NUMERO DO FUNCIONARIO");
		 int numF = sc.nextInt();
		 
		 System.out.println("DIGITE O NUMERO DE HORAS DO FUNCIONARIO");
		 int numH = sc.nextInt();
		 
		 System.out.println("DIGITE O VALOR DA HORA TRABALHADA");
		 double HoraValor = sc.nextDouble();
		 
		 double calculo = numH * HoraValor;
		 
		 
		 
		 System.out.println("FUNCIONARIO: " + numF);
		 System.out.println("SALARIO: " + calculo);
		 
		 
		
	}
}
