package Q1;
import java.text.SimpleDateFormat;

import java.util.Date;
 
public abstract class Conta {
	
	private double saldo;

	public Conta(double saldo) {
		super();
		this.setSaldo(saldo);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public abstract void imprimeExtrato();

}
