package br.com.java.oo.animais;

public class Gato extends Animal{ //a classe Gato vai estender a classe Animal (vai receber todas as caracteristicas da classe Animal)
	
	public Gato(String nome, String cor, double peso) {
		super(nome, cor, peso);
	}

	//Atributos
	static int numeroDeGatos;
	/* -> já está presente na classe de herença Animal
	private String nome;
	private String cor;
	private double altura;
	private double peso;
	private String estadoEspirito;
	
	//Construtor:
	public Gato(String nome, String cor, double altura, double peso, String estadoEspirito) {
		this.nome = nome;
		this.cor = cor;
		this.altura = altura;
		this.peso = peso;
		this.estadoEspirito = estadoEspirito;
		numeroDeGatos++;
	}
	*/
	
	/* -> já está presente na classe de herança Animal
	//Métodos:
	void comer() {}
	void dormir() {}
	void soar() {System.out.println("MIAU MIAU");}
	*/
	
	//toString()
	@Override
	public String toString() {
		return "Gato [nome=" +nome+"]";
	}

	@Override //Método que foi herdado. Mesmo nome, mas com funcionalidades distintas
	public void soar() {
		System.out.println("MIAU MIAU!");
	}
	
	
	
}
