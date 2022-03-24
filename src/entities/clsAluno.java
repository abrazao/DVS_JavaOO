package entities;

public class clsAluno {
	
	public String nome;
	public double primeiroTrimestre, segundoTrimestre, terceiroTrimestre;
	public double notaFinal;
	public boolean aprovado;
	
	
	public double calculaNota() {
		notaFinal = primeiroTrimestre + segundoTrimestre + terceiroTrimestre;
    	return notaFinal;
	}
	
	public boolean verificaAprovacao(double notaFinal) {
		if (notaFinal >= 60) {
			return true;}
		else {
			return false;
		}
	}
	
	public double verQuantoFaltou() {
		
		return 60.0 - notaFinal;
		
	}
}
