package br.com.banco;

public interface InterfaceConta {
	
	
	void sacar(double valor);
	
	void transferir(Conta contadestinho , double valor);
	
	void depósito(double valor);
	
	int saldo();
	
	void imprimirExtrato();

}
