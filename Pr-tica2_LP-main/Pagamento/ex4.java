package ex2;

import java.util.Scanner;
import java.util.Random;

public class ex4 {
	
	 Scanner entrada = new Scanner(System.in);
    Random numrandomico = new Random();
    short op;
    int NumVoo, NumPol, num =0;
    String cpf,nome;
    do{
    	System.out.println("1 - Cadastrar Passageiro");
    	System.out.println("2 -Check in");
    	System.out.println("3 - cancelar Voo");
    	System.out.println("4 - Sair");
    	Scanner ler;
		num = ler.nextInt();
		switch (num){
        case 1:
          System.out.println ("Digite seu nome");
          nome = ler.next();
          System.out.println ("Digite seu CPF");
          cpf = ler.next();
          System.out.println ("Digite seu número de voo");
          NumVoo = ler.nextInt();
          
          System.out.println ("Cadastro efetuado com sucesso.");

          break;
        case 2:
            System.out.println ("Digite seu CPF");
            cpf = ler.nextLine();
            System.out.println ("Digite o número do voo");
            NumVoo = ler.nextInt();
            System.out.println ("Digite o número da poltrona");
            NumPol = ler.nextInt();

            
            System.out.println ("Check in efetuado com sucesso");
            break;
		
    	
		 }
    }
    
}
