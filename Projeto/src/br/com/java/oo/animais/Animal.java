package br.com.java.oo.animais;

//Aprendendo Herança:

//transfomando em classe abstrata -> assim, não será possível criar um objeto através dela, só pela sua extensão
public abstract class Animal {
	
	//Atributos
	protected String nome;
	protected String cor;
	protected double altura;
	protected double peso;
	protected String estadoDeEspirito;
	
	//Construtor
	public Animal(String nome, String cor, double peso) {
		this.nome = nome;
		this.cor = cor;
		this.peso = peso;
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public String getEstadoDeEspirito() {
		return estadoDeEspirito;
	}



	public void setEstadoDeEspirito(String estadoDeEspirito) {
		this.estadoDeEspirito = estadoDeEspirito;
	}



	//Métodos:
	protected void comer() {}
	protected void dormir() {}
	public abstract void soar() {}//o "void" indica que não dá retorno
}
