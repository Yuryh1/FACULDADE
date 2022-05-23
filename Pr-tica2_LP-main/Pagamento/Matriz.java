package pagamento;

public class vetor {
 
	public static void main(String[]args) {
		int [][] matriz = new int [50] [50];
		int impar=1;
		for(int linhas=0;linhas<50;linhas++) {
			for(int coluna=0;coluna<50;coluna++) {
				matriz[linhas][coluna]=impar;
				
				if(linhas==coluna)
					System.out.printf("%d/t",matriz[linhas][coluna]);
				else 
					System.out.printf("0/t");
				impar+=2;
			}
			System.out.printf("/n");
		}
	} 
}
