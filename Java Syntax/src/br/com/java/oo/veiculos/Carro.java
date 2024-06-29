package br.com.java.oo.veiculos;

public class Carro extends Veiculo{ //herança
	
	public void ligar() { //abstração com mais de uma lógica
		confereCambio(); //encapsulamento
		confereCombustivel(); //encapsulamento
		System.out.println("Carro ligado");
	}
	public void confereCombustivel() {
		System.out.println("Conferindo combustivel");
	}
	public void confereCambio() {
		System.out.println("Conferindo cambio em P");
	}
	
	
	
	
}
