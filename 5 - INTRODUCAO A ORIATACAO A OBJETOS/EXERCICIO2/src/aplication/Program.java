package aplication;

import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee funcionario = new Employee();

		funcionario.nome = sc.nextLine();
		funcionario.salarioBruto = sc.nextDouble();
		funcionario.imposto = sc.nextDouble();

		System.out.println("Nome: " + funcionario.nome);
		System.out.println("Salario Bruto: " + funcionario.salarioBruto);
		System.out.println("Imposto: " + funcionario.imposto);
		System.out.println();

		System.out.println("Salario liquido: " + funcionario.salarioLiquido());
		System.out.println();
		System.out.println("Quanto de porcentagem deseja acrescentar ao salario?");
		funcionario.porcentagem = sc.nextDouble();

		System.out.println("VALOR ATUALIZADO: " 
		+ funcionario.nome + ", " + "$" + funcionario.porcentagemSalario());

		sc.close();

	}

}
