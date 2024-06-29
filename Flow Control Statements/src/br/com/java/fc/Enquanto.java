package br.com.java.fc;

import java.util.concurrent.ThreadLocalRandom; //classe para valor aleatorio

public class Enquanto {

	public static void main(String[] args) {
		double mesada = 50.0;
		
		while (mesada > 0) {
			double valorDoce = valorAleatorio(); //para vir um valor aleatório
			if (valorDoce > mesada) //verificação para nao vir valor negativo
				valorDoce = mesada;
			
			System.out.println("Doce do valor: "+valorDoce +"\nAdicionado no carrinho");
			mesada = mesada - valorDoce; //diminuindo da mesada
			
		}
		System.out.println("Mesada: "+mesada);
		System.out.println("Joãozinho gastou toda a sua mesada em doces");

	}
	
	//metodo p/ valor aleatorio
	private static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2, 8);
	}

}
