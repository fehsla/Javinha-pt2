package lacorepeticao;
import java.util.Scanner;

public class EXERCICIO4 {
	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
		 * até X, um valor por linha, inclusive o X, se for o caso.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y;
		
		for(y = 1; y < x; y = y + 2) {
			System.out.println("VALOR IMPAR:" + y);
		}
		
		sc.close();
	}
}
