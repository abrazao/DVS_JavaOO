package curso_programacao;
import java.util.Scanner;

import entities.clsAluno;

public class Alunos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		clsAluno aluno = new clsAluno();
		
		System.out.print("Digite o nome do aluno:");
		aluno.nome = sc.next();
		
		System.out.print("Digite as 3 notas do aluno:");
		aluno.primeiroTrimestre = sc.nextDouble();
		aluno.segundoTrimestre = sc.nextDouble();
		aluno.terceiroTrimestre = sc.nextDouble();
		
		System.out.println();
		
		aluno.calculaNota();
		
		if (aluno.verificaAprovacao(1)) {
			System.out.println(aluno.nome + " foi Aprovado!");
		}
		else {
			System.out.println(aluno.nome + " foi Reprovado!");
			System.out.printf("Faltou:");
			System.out.println(aluno.verQuantoFaltou());
		}
		
		
	}

}
