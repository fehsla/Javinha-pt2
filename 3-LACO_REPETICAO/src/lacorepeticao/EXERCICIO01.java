package lacorepeticao;

import java.util.Scanner;

public class EXERCICIO01 {

	/*
	 * Escreva um programa que repita a leitura de uma senha até que ela seja
	 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
	 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
	 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
	 * correta é o valor 2002.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("INFORME A SENHA");
		int password = sc.nextInt();

		while (password != 4444) {
			System.out.println("ACESSO NEGADO");
			password = sc.nextInt();
		}

		System.out.println("ACESSO PERMITIDO");

		sc.close();
	}
}
