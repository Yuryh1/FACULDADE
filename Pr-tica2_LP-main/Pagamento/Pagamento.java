package Pagamento;

import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
 
		  
			// TODO Auto-generated method stub

			Scanner entrada= new Scanner(System.in);
			
			int Client;
			double p1;
			double p2;
			double p3;
			int numMon;
			
			
			System.out.println("Gasto do cliente:");
			Client = entrada.nextInt();
			
			System.out.println("Selecione as op�oes do menu \n 1- � vista\n 2- Parcelado 2x: em duas vezes (pre�o da etiqueta) \n 3- Parcelado de 3x at� 6x: de 3 at� 6 vezes com 3% de juros ao m�s \n 4- compras acima de R$ 500,00 - inclusiver");
			
			short num = entrada.nextShort();
			
			switch (Client) {
				case 1: 
					p1 = (double) (Client * 0.9);
					 
					
					break;
				
				case 2:
					p2= Client / 2 ;
					String payment = "Valor a pagar: Duas parcelas de:" + p2;
					
					 
					
					break;
					
				case 3: 
					
					System.out.println("Quantas parcelas solicitadas?");
					numMon = entrada.nextInt();
					
					if (numMon == 3 || numMon == 4 || numMon == 5 || numMon == 6) {
						
						for (int i =0; i <= numMon; i++) {
							p3 = Client;
							p3 = (double) (p3 + (p3 * 1.03));
						}
						
						 
					}
					
				default: 
					System.out.print("Selecione uma das op��es de pagamento");
					
					break;
					
			}
			
					
		}
}
	 
 
