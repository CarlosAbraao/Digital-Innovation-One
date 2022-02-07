package br.com.banco;

public class Main {
	
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.depósito(500);
		
		cc.imprimirExtrato();
		
		
		cc.transferir(cp, 300);
		
		cp.imprimirExtrato();
		cc.imprimirExtrato();
	}

}
