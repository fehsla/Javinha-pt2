
public class Program {
	public static void main(String[] args) {
		
		/*
		 * BOA PRATICA -> SEMPRE INDIQUE O TIPO DO NUMERO, SE A EXPRESSAO FOR DE PONTO
		 * FLUTUANTE (NAO INTEIRA).
		 * 
		 * PARA DOUBLE USE -> .0
		 * PARA FLOAT USE -> f
		 * 
		 * ___________________________________
		 * 
		 * CASTING (CONVERSAO EXPLICITA DOS VALORES)
		 * 1 -> A EXPRESSAO É CALCULADA
		 * 2 -> O RESULTADO DA EXPRESSAO É ARMAZENADA NA VARIAVEL.
		 *
		 * 
		 * 
		 * 
		 * 
		 * */
		
	//*
	//Exemplo 1.
		
	 int x;
	 double y;
	 
	 x = 5;
	 y = 2 * x;
	 
	 System.out.println(x);
	 System.out.println(y);
	 
	 //Exemplo 2.
	 
	 double b, B, h, area;
	 
	 b = 6.0;
	 B = 8.0;
	 h = 5.0;
	 
	 area = (b + B) / 2.0 * h;
	 System.out.println(area);
	 
	 //Exemplo 4
	 
	 int a, z;
	 double resultado;
	 
	 a = 5;
	 z = 2;
	 
	 resultado = (double)a / z; //casting
	 System.out.println(resultado);
	 
	 //Exemplo 5
	 
	 double p;
	 int q;
	 
	 p = 5.0;
	 q = (int) a; //casting
	 
	 System.out.println(q);
	 
 }
}
