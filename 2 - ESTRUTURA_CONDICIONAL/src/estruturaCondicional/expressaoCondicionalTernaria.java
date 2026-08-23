package estruturaCondicional;

import java.util.Scanner;

public class expressaoCondicionalTernaria {
	public static void main(String[] args) {
		//EXPRESSAO CONDICIONAL TERNARIA
		//CASO A CONDICAO SEJA FALSA, O VALOR ATRIBUIDO E SEGUNDO
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
	}
}
