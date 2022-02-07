package br.com.banco;

public abstract class Conta implements InterfaceConta {
	

	private static  String AGENCIA_PADRAO = "0001";
	
	private static int SEQUENCIAL = 1;
	
	protected String agencia;
	protected int numeroConta;
	protected double saldo;
	private Cliente cliente;
	
	
	public Conta() {
		
		

		
			this.agencia = AGENCIA_PADRAO;
			this.numeroConta = SEQUENCIAL++;
			
		
	}
	
	
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}


	@Override
	public void transferir(Conta contaDestino, double valor) {
		saldo += valor;
		contaDestino.depósito(valor);
		
	}


	@Override
	public void depósito(double valor) {
		
		
		this.saldo =saldo + valor;
		System.out.println("voce depositou: "+ valor + " R$.");
		System.out.println("");
		
	}


	@Override
	public int saldo() {
		// TODO Auto-generated method stub
		return 0;
	}


	

	public String getAgencia() {
		return agencia;
	}



	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}




	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	

	
	
	
	

}
