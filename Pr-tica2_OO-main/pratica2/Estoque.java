package pratica2;

public class Estoque {
	


	String nome;
	int qAtual;
	int qMin;
	
	public Estoque (String nome, int qtdAtual, int qtdMin) {
		this.nome = nome;
		this.qAtual = qAtual;
		this.qMin = qMin;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getqAtual() {
		return qAtual;
	}

	public void setqAtual(int qAtual) {
		this.qAtual = qAtual;
	}

	public int getQtdMin() {
		return qMin;
	}

	public void setQtdMin(int qtdMin) {
		this.qMin = qMin;
	}
	
	
	
	public void darBaixa(int qtdAtual) {
		this.qAtual= qAtual;
	}
	
	public String mostra() {
		return "Nome do produto =" + nome + "Quantos  produto =" + qAtual + "Quantidade Mínima = " + qMin;
		
	}
	
	public boolean presaRepor() {
		if (qAtual <= qMin) {
			return true;
		} else {
			return false;
		}
	}
}