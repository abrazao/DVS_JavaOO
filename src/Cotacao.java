import java.util.Scanner;

import entities.clsConverteDolar;

public class Cotacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valorReais = 0.00;
		double valorCotacao = 0.00;
		double valorDolarCompra = 0.00;
		clsConverteDolar converter = new clsConverteDolar();
		
		System.out.print("Cotação do Dolar:");
		valorCotacao = sc.nextDouble();
		
		System.out.print("Quantos dólares serão comprados:");
		valorDolarCompra = sc.nextDouble();
		
		System.out.print("Quantos dólares serão comprados:");
		valorReais = converter.Converter(valorCotacao, valorDolarCompra);
		System.out.println(valorReais);
		
		sc.close();
		
		
		

	}

}
