package br.com.banco;

public class ContaPoupanca extends Conta {
	
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Imprimindo extrato CONTA POUPANÇA ====");
		System.out.println(String.format("Agencia %s", super.agencia));
		System.out.println(String.format("Numero da conta %d", super.numeroConta));
		System.out.println(String.format("saldo %.2f", super.saldo));
	
	System.out.println("");
	System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

}}
