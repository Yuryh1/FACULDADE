package Q1;

import java.util.Scanner;

public class VETOR {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int[] notas = new int[10];
			int soma = 0, media= 0, aux = 0;		
			for(int i=0;i<10;i++){
				System.out.printf("Insira sua nota",i+1);
				notas[i]= ler.nextInt();	
				soma = soma +notas[i];
			}
			for(int i=0; i < 10; i++) {
				for(int j=0; j<9; j++) {
					if(notas[j] > notas[j+1]) {
						aux = notas[j];
						notas[j] = notas[j+1];
						notas[j+1]=aux;
						
					}
				}
			}
			
			System.out.println("A m�dia � de "+soma/10);
			System.out.println("A maior nota � de "+notas[9]);
			System.out.println("A 2� maior nota � de:  "+notas[8]);
			System.out.println("A 3� maior nota � de:  "+notas[7]);
			System.out.println("A menor nota � de:  "+notas[1]);
		}
		

	}

}
