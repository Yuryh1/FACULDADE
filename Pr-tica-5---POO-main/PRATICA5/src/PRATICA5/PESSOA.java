package PRATICA5;

 
 

public class Pessoa {

	String nome;
	double altura;
	double peso;
	
	
	public Pessoa(String nome, double altura, double peso) {
		super();
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String imprimir() {
		return "Nome: " + nome + "\n Peso: " + peso + "\n Altura: " + altura;
	}
}
