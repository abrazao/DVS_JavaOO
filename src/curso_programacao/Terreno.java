package curso_programacao;

import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {

		double largura, comprimento, vlm2, area, preco;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a Largura do Terreno: ");
		largura = sc.nextDouble();
		
		System.out.print("Digite o Comprimento do Terreno: ");
		comprimento = sc.nextDouble();
		
		System.out.print("Digite o valor do Metro Quadrado: ");
		vlm2 = sc.nextDouble();
		
		area = largura * comprimento;
		System.out.printf("A Área do Terreno é: %.2f%n", area );
		System.out.printf("O Valor do Metro Quadrado Digitado é: %.1f%n", vlm2);
		
		sc.close();
		
				

	}

}
