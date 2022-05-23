package questao1;

public class ingressoC extends ingresso{
	
	private String localizacao;
	private double valorAdicional;
	@SuppressWarnings("unused")
	private double valor;
	public void Camarote(double valor, String localizacao, double valorAdicional) {
		
		this.localizacao = localizacao;
		this.valorAdicional = valorAdicional;
	}
	
	public void imprimeCamarote () {
		
		double valorCamarote = valorAdicional + getValor();
		
		System.out.println("===Ingresso Camarote===");
		System.out.println("Valor ingresso com adiconal: " + valorCamarote);
		System.out.println("Camarote localizado em: " + localizacao);
		
	}

}

