
public class Conta {

	public String conta;
	private double saldo;
	private double creditar;
	private double debitar;
	
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double setCreditar(double valor) {
		return valor;
	}
	
	public void getCreditar(double valor) {
		this.saldo += valor ;
	}
	
	public double setDebitar(double valor) {
		return valor;
	}
	
	public void getDebitar(double valor) {
		saldo -= valor;
	}
	
}