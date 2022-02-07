package br.com.banco;

import java.util.List;

public class Banco {
	
	private String nomeBanco;
	private List<Conta> contas;
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public List<Conta> getConta() {
		return contas;
	}
	public void setConta(List<Conta> conta) {
		this.contas = conta;
	}
	
	

}
