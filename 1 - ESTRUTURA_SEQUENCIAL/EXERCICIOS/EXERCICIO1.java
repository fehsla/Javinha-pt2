package java_aulas;
import java.util.Scanner;

public class EXERCICIO1 {
	public static void main(String[] args) {
		//EXERCICIO 01 - FAZER A LEITURA DE DOIS NUMEROS INTEIROS E REALIZAR A IMPRESSAO DO MESMO NA TELA
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("INSIRA OS VALORES A SEREM SOMADOS");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("A SOMA DOS INTEIROS É:" + (a + b));
	}
}
