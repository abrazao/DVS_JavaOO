package curso_programacao;

import java.util.Scanner;

import entities.clsContaBancaria;

public class ContaBancaria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		clsContaBancaria contaBancaria = new clsContaBancaria();
		
		System.out.print("Nome do Titular:");
		contaBancaria.setNomeTitular(sc.next());
		
		System.out.println("Número da Conta:");
		contaBancaria.setNroConta(sc.next());
		
		System.out.println();
		System.out.print("Depósito Inicial:");
		contaBancaria.setValorDepositoInicial(sc.nextDouble());
		
		System.out.println();
		System.out.println("Vamos fazer um depósito na conta.");
		System.out.println("=================================");
		System.out.println();
		System.out.print("Valor do Depósito:");
		contaBancaria.depositoContaCorrente(sc.nextDouble());
		
		System.out.println();
		System.out.printf("Saldo da Conta: %.2f", contaBancaria.saldoContaCorrente());
		System.out.println();
		
		System.out.println();
		System.out.println("Vamos fazer um saque na conta.");
		System.out.println("==============================");
		System.out.println();
		System.out.print("Valor do Saque:");
		contaBancaria.saqueContaCorrente(sc.nextDouble());
		
		System.out.println();
		System.out.printf("Saldo da Conta: %.2f", contaBancaria.saldoContaCorrente());
		System.out.println();
		
		sc.close();
		
	
	}

}
