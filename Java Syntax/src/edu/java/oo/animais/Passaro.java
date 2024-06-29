package edu.java.oo.animais;

public class Passaro extends Animal { //a classe Passaro vai estender a classe Animal (vai receber todas as caracteristicas da classe Animal)
	
	//Construtor que linka com a classe Animal
	public Passaro(String nome, String cor, double peso) {
		super(nome, cor, peso);
	
	}

	//Atributos
	static int numeroDePassaros;
	/* -> já está presente na classe de herança Animal
	private String nome;
	private String cor;
	private double altura;
	private double peso;
	private String estadoEspirito;
	*/

	@Override //Método que foi herdado. Mesmo nome, mas com funcionalidades distintas
	public void soar() {
		System.out.println("PIU PIU");
	}
	
	/*Construtor:
	public Passaro(String nome, String cor, double altura, double peso, String estadoEspirito) {
		this.nome = nome;
		this.cor = cor;
		this.altura = altura;
		this.peso = peso;
		this.estadoEspirito = estadoEspirito;
		numeroDePassaros++;
	}
	*/
	
	/* -> já está presente na classe de herança Animal
	void comer() {}
	void dormir() {}
	void soar() {System.out.println("PIU PIU");}
	*/
	
	
	
	

}
