package Pagamento;

import java.util.Scanner;
 

public class Vetor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int [] vetor = new int [10];
		int aux;
		 
		for(int i=0;i<10;i++) {
			System.out.printf("\nDigite Posicão 4%d", i+1);
			vetor[i]= entrada.nextInt();
			 
			}
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<9; j++) {
				if(vetor[j]> vetor[j+1]) {
					
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
					
					
				}
				
				
		}
		
 
	}
		System.out.println("Vetor ordenado");
		for(int i=0; i<10;i++) {
			System.out.printf("%d\t", vetor[1]);
		}
		
}
}