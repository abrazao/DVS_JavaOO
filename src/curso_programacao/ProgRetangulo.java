package curso_programacao;
import java.util.Scanner;

import entities.Retangulo;

public class ProgRetangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		Retangulo retang = new Retangulo();
		
		System.out.print("Digite a Base: ");
		retang.base = sc.nextInt();
		
		System.out.println("Digite a Altura:");
		retang.altura = sc.nextInt();
		
		System.out.printf("A �rea do Retangulo �: %.2f%n", retang.areaRetangulo());
		System.out.printf("O Per�metro do Retangulo �: %.2f%n", retang.perimetroRetangulo());
		System.out.printf("A Diagonal do Retangulo �: %.2f%n", retang.diagonalRetangulo());
		
		sc.close();
	}

}
