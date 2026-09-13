package aplication;
import java.util.Scanner;
import entities.calculosDolar;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor do Dollar");
		calculosDolar.dolar = sc.nextDouble();
		
		System.out.println("Insira o valor que precisa em Dollar");
		calculosDolar.valorConversao = sc.nextDouble();
		
		System.out.printf("VALOR QUE PRECISA SER PAGO PARA ADQUIRI O DOLAR: %.2f%n", 
		(calculosDolar.valorConvertido() + calculosDolar.porcentagemIof()));
		
		sc.close();
	}
}
