package br.com.devcarlos;

import java.util.Scanner;

/*
 * VOU FAZER ALGUMAS PEQUENAS REVIS?ES COM ALGUNS CONTEUDOS
 * 
 * */

public class ExecuteDebug {
	
	public static void main(String[] args) {
		// VOU USAR O EXEMPLO DE UMA CALCULADORA PARA DEBUG
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		int a = sc.nextInt();
		
		System.out.println("Digite o valor de b: ");
		int b = sc.nextInt();
		
		int resultado = soma(a,b);
		
		System.out.println("O resultado ?: " + resultado);
		
	}
	
	
	// CRIANDO UMA CALCULADORA QUE SOMA DOIS NUMEROS
	
	public static int soma(int a, int b) {
		
		return a + b;
	}

}
