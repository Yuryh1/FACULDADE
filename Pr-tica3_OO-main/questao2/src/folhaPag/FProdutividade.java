package folhaPag;

public class FProdutividade extends funcionario {

	public FProdutividade(int matricula, String nome, double salario) {
		super(matricula, nome, salario);
	}
	private double valor;
	private int produ�ao;
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getProdu�ao() {
		return produ�ao;
	}
	public void setProdu�ao(int produ�ao) {
		this.produ�ao = produ�ao;
	}
	public double calcularProventos() {
		return getSalario()+(this.valor*this.produ�ao);
	}
	public String toString() {
		return "Nome: "+ getNome() + "Sal�rio: " + calcularProventos();
	}
}