package folhaPag;

public class FPadrao extends funcionario {

	
	public FPadrao(int matricula, String nome, double salario) {
		super(matricula, nome, salario);
	}

	public double calcularProventos() {
		return getSalario();
	}

	public String toString() {
		return "Nome: "+ getNome() + " Salário: " + getSalario();
	}

	
}