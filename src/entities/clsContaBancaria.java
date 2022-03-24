package entities;

public class clsContaBancaria {
	private String nomeTitular;
	private String nroConta; 
	private double valorDepositoInicial;
	private double valorSaldoConta;
	
	double valorSaque;
	double valorDeposito;
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getNroConta() {
		return nroConta;
	}
	public void setNroConta(String nroConta) {
		this.nroConta = nroConta;
	}
	
	public void setValorDepositoInicial(double valorDepositoInicial) {
		this.valorDepositoInicial = valorDepositoInicial;
		this.valorSaldoConta = this.valorDepositoInicial;
	}
	
	public void saqueContaCorrente(double valorDoSaque) {
		this.valorSaldoConta = (valorSaldoConta - valorDoSaque) - 5.00;
	}
	
	public void depositoContaCorrente(double valorDeposito) {
		this.valorSaldoConta += valorDeposito;
	}
	
	public double saldoContaCorrente() {
		return this.valorSaldoConta;
	}
}
