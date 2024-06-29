package edu.java.oo.veiculos;

public class Autodromo {
	public static void main (String[] args) {
		Carro jeep = new Carro();
		/* sem encapsulamento
		jeep.confereCambio();
		jeep.confereCombustivel();
		*/
		jeep.setChassi("89797");
		jeep.ligar(); //uma forma de ligar (polimorfismo)
		
		Moto z400 = new Moto();
		z400.setChassi("467754");
		z400.ligar(); //outra forma de ligar (polimorfismo)
		
	}
	
	
}
