package questao1;

public class ingressoV extends ingresso {
	
	public void Vip(double valor) {
		super(valor);
	}

	private double valorAdicional;

	public ingressoV(double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}
	
	public void imprimeVip () {
		
		double valorVip = valorAdicional + getValor();
		
		System.out.println("===Ingresso VIP===");
		System.out.println("Valor ingresso com adiconal: " + valorVip);
		
	}
	
	
}
