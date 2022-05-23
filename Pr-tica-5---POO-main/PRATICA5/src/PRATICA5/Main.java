package PRATICA5;

public class Main {

	 
public static void main(String[] args) {
		
		 String nome;
	     double altura, peso;
		
		Pessoa func1 = new Pessoa ("Lewandowski",185,75);
		Pessoa func2 = new Pessoa ("Haaland", 194, 88);
		Pessoa func3 = new Pessoa ("Suarez", 182, 83);
		
		Scanner ler = new Scanner(System.in);
		Pessoa [] pessoas = new Pessoa [10];
		for (int i=0; i<10; i++)
		{
		            System.out.println("Escreva o nome: ");
		            nome = ler.next();
		            System.out.println("Escreva a altura em cm: ");
		            altura = ler.nextFloat();
		            System.out.println("Escreva o peso: ");
		            peso = ler.nextFloat();
		            pessoas[i]= new Pessoa(nome,altura,peso);
		        }
		        for (int i = 0; i<pessoas.length;i++) System.out.println(pessoas[i].imprimir());
		    }
}
