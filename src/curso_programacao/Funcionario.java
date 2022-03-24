package curso_programacao;

import java.util.Scanner;
import entities.clsFuncionario;
public class Funcionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Instanciamento da Classe
		clsFuncionario funcionario = new clsFuncionario();
		
		System.out.print("Nome do Funcionario: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Salário Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.print("Percentual de Aumento:");
		double percentual = sc.nextDouble();
		
		funcionario.aumentoSalario(percentual);
		
		//Modofiquei o método toString para mostrar os dados
		System.out.println("Dados do Funcionário: " + funcionario);
		
		sc.close();

	}

}
