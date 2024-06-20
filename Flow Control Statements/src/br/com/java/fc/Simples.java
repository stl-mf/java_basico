package br.com.java.fc;

public class Simples {

	public class CaixaEletronico{
		public static void main (String[] args) {
			double saldo = 300;
			double saque = 20;
		
			if (saque < saldo) 
				saldo = saldo - saque; //uma estrutura para uma condição
			
			System.out.println(saldo);
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
