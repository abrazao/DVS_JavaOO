import java.util.Scanner;

import entities.clsConverteDolar;

public class Cotacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valorReais = 0.00;
		double valorCotacao = 0.00;
		double valorDolarCompra = 0.00;
		clsConverteDolar converter = new clsConverteDolar();
		
		System.out.print("Cota��o do Dolar:");
		valorCotacao = sc.nextDouble();
		
		System.out.print("Quantos d�lares ser�o comprados:");
		valorDolarCompra = sc.nextDouble();
		
		System.out.print("Quantos d�lares ser�o comprados:");
		valorReais = converter.Converter(valorCotacao, valorDolarCompra);
		System.out.println(valorReais);
		
		sc.close();
		
		
		

	}

}
