package curso_programacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		double media = 0.0;
		
		System.out.print("Digite Seu nome: ");
		nome = sc.next();
		
		System.out.print("Digite sua idade:");
		idade = sc.nextInt();
		
		String strmedia;
		
		
		System.out.print("Digite sua média escolar:");
		media = sc.nextDouble();
		try
		{
			media = sc.nextDouble();
		}
		catch (InputMismatchException e) {
			strmedia = Double.toString(media);
			media = Double.parseDouble(strmedia.replace("," , "."));
		}
		
		
		sc.close();
		
		System.out.println(nome + " tem " + idade + " anos");
		System.out.printf("E sua média escolar é: %.2f%n", media);

	}

}
