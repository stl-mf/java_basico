package br.com.java.basico;

public class Funcoes {
	
	//Escopo
	public static void main(String[] args) {
		//é dentro de método main que fazemos as chamadas das funções
		String aluno = "Carlos";
		saudacao(aluno);
		
		int nota = soma(4, 9);
		System.out.println(aluno+", sua média foi: "+nota/2+".");
	}
	
	//Outro escopo
	//função "saudacao" com um parametro tipo string
	public static void saudacao(String nome) {
		System.out.println("Olá! "+nome+".");
	}
	
	//Mais um escopo
	//função "soma" com dois parametros tipo int
	public static int soma(int a, int b) {
		return a + b;
	}

}
