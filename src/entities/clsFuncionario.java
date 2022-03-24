package entities;

public class clsFuncionario {
	public String nome;
	public Double salarioBruto;
	public Double imposto;
	
	
	public double salarioLiquido() {
		return this.salarioBruto - this.imposto; 
	}
	public void aumentoSalario(double percentual) {
		this.salarioBruto += this.salarioBruto * percentual / 100.0;
	}
	
	public String toString() {
		return this.nome + ", $ " + String.format("%.2f",salarioLiquido());
	}
	
}
