package entities;

public class clsConverteDolar {
	double valorReais = 0.00; 
	public double Converter(double valorCotacao, double valorDolarComprar) {
		this.valorReais = valorCotacao * valorDolarComprar;
		return (this.valorReais);
	}

}
