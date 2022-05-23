package folhaPag;

public class FComissionado extends funcionario {
	
	public FComissionado(int matricula, String nome, double salario, int i, int j) {
		super(matricula, nome, salario);
	}
	private double percentual;
	private double vendas;
	
	public double getVendas() {
		return vendas;
	}
	public void setVendas(double vendas) {
		this.vendas = vendas;
	}
	public double getPercentual() {
		return percentual;
	}
	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}
	public double calcularProventos() {
		return getSalario() + (this.vendas*this.percentual/100);
	}

	public String toString() {
		return "Nome: "+ getNome() + " Sal�rio: " + calcularProventos();
	}
}
