package Q1;
import java.text.SimpleDateFormat;

import java.util.Date;
 
public class ContaPoupanca extends Conta {

	public ContaPoupanca(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimeExtrato() {
		System.out.println("###Extrato da conta###");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm;ss");
		
		Date date = new Date();
		
		System.out.println("saldo: ?" + this.getSaldo());
		System.out.println("data: ?" + sdf.format(date));
		
	}
	 
		
	}

 
