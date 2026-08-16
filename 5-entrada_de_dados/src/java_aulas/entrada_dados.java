package java_aulas;
import java.util.Scanner;

public class entrada_dados {
	
	public static void main(String[] Args){
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char a;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		a = sc.next().charAt(0);
		
		System.out.println("Dados digitados");
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		
		sc.close();
	}
}
