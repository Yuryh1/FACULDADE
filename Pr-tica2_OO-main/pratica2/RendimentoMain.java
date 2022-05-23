package Questao2;

public class RendimentoMain {
	
public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double investimentoInicial, taxaRendimento = 0;
		int numeroMeses;
		
			
		System.out.println("Insira o investimento incial: ");
		investimentoInicial = ler.nextFloat();
		
		System.out.println("Insira a taxa de rendimento: ");
		taxaRendimento = ler.nextFloat();
		
		System.out.println("Insira número de meses do investimento: ");
		numeroMeses = ler.nextInt();
		
		Rendimento rendimento = new Rendimento (investimentoInicial,taxaRendimento, numeroMeses); 
	
		System.out.println("Segue abaixo seu rendimento final respectivamente nos " + numeroMeses + " meses:");
		rendimento.Montante();


	}

}
