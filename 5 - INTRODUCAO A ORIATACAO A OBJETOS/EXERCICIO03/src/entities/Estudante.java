package entities;

public class Estudante {
	/*
	 * fazer um programa para ler o nome de um aluno e as tres notas que ele obteve
	 * nos tres trimestres do ano (primeiro trimestre valor 30 e o segundo e
	 * terceiro valem 35 cada). ao final, mostrar qual a nota final do aluno no ano.
	 * dizer tambem se o aluno esta aprovado (PASS) OU nao (failed), e, em caso
	 * negativo, quantos pontos faltam para o aluno obter o minimo para ser aprovado
	 * que é 60 por cento da nota . voce deve criar uma student para resolver o
	 * problema.
	 */

	public String nome;

	public int nota1;
	public int nota2;
	public int nota3;

	public int calculoNota() {
		return nota1 + nota2 + nota3;
	}

	public int analiseAprovacao() {
		return (100 * 60) / 100;
	}

	public int pontoFaltante(){
		return analiseAprovacao() - calculoNota();
	}
	
	
	
	
}
