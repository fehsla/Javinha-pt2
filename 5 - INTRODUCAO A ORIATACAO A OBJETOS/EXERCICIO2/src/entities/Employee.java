package entities;

public class Employee {
	/*
	 * fazer um programa para ler os dados de um funcionario (nome, salario bruto e
	 * imposto). em seguida, mostrar os dados do funcionario (nome e salario
	 * liquido). em seguida, aumentar o salario do funcionario com base em uma
	 * porcentagem dada (somente o salario bruto é afetado pela porcentagem) e
	 * mostrar novamente os dados do funcionario. use a classe projetada abaixo.
	 */

	public String nome;
	public Double salarioBruto;
	public Double imposto;
	public double porcentagem;

	public Double salarioLiquido() {
		return salarioBruto - imposto;
	}

	public Double porcentagemSalario() {
		return salarioLiquido() + (salarioBruto * porcentagem) / 100;
	}

}
