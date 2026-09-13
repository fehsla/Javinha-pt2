package aplication;

import entities.Estudante;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		Scanner sc = new Scanner(System.in);

		estudante.nome = sc.nextLine();
		estudante.nota1 = sc.nextInt();
		estudante.nota2 = sc.nextInt();
		estudante.nota3 = sc.nextInt();

		while(estudante.nota1 <= 30 && estudante.nota2 <= 35 && estudante.nota3 <= 35) {
			System.out.println("ALUNO: " + estudante.nome);
			System.out.println("NOTA FINAL: " + estudante.calculoNota());
			
			if(estudante.calculoNota() >= estudante.analiseAprovacao()) {
				System.out.println("APROVADO");
				break;
			}else if(estudante.calculoNota() < estudante.analiseAprovacao()){
				System.out.println("REPROVADO");
				System.out.println("PONTOS FALTANTES: " + estudante.pontoFaltante());
				break;
				
			}
		
		}
		
		sc.close();

	}
}
