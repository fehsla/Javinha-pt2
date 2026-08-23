package estruturaCondicional;
import java.util.Scanner;
import java.util.Locale;

public class estruturaOpcional1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		double conta = 50.0;
		
		if(minutos > 100) {
			conta += (minutos - 100) * 2;
		}
		
		System.out.printf("VALOR DA CONTA = R$%.2f%n",  conta);
	}
}
