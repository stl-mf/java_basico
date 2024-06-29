package br.com.java.basico;

public class Pessoa {
	
	//ATRIBUTOS
	private String nome;
	private String cpf;
	private String endereço;
	
	//MÉTODOS
	
	//construtor
	public Pessoa (String cpf, String nome) { //com parâmetro
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public Pessoa () { //sem parâmetro
		
	}
	
	//getX e setX
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	public static void main (String[] args) {
		Pessoa marcos = new Pessoa("123", "MARCOS"); //instanciando novo objeto com método construtor
		System.out.println(marcos.getNome()+" - "+marcos.getCpf());
		
	}
	
	

}
