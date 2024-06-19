package br.com.java.basico;

public class Vetores {

	public static void main(String[] args) {
		
	//Proposta:
	//[0] [1] [2] [3] [4]
	System.out.println("Primeira proposta: ");
	int [] numeros = new int[5];
	numeros[0] = 1;
	numeros[1] = 2;
	numeros[2] = 3;
	numeros[3] = 4;
	numeros[4] = 5;
	
	for (int i = 0; i < numeros.length; i++) {
		System.out.println(numeros[i]);
	}
	
	System.out.println();
	
	//Proposta:
	//[A] [B] [C] [D] [E]
	System.out.println("Segunda proposta: ");
	String [] letras = new String[5];
	letras[0] = "A";
	letras[1] = "B";
	letras[2] = "C";
	letras[3] = "D";
	letras[4] = "E";
	
	for (int j = 0; j < letras.length; j++) {
		System.out.print(letras[j]+" ");
	}
	
	System.out.println();
	
	//Quando já temos os dados da nossa array
	System.out.println("De outra forma: ");
	String[] letras2 = {"F", "G", "H", "I", "J"};
	for (int k=0; k<letras2.length; k++) {
		System.out.print(letras2[k]+" ");
	}
	
	System.out.println();
	
	//Proposta:
	//Qual o maior, menor e a média
	int[] conjuntoNumeros = {3,6,7,2,1};
	
	//definindo os valores iniciais
	int maior = conjuntoNumeros[0];
	int menor = conjuntoNumeros[0];
	int media = 0;
	
	//laço numérico
	for (int a = 0; a < conjuntoNumeros.length; a++) {
		if (conjuntoNumeros[a] > maior) {
			maior = conjuntoNumeros[a];
		}
		if (conjuntoNumeros[a] < menor) {
			menor = conjuntoNumeros[a];
		} 
		media += conjuntoNumeros[a]; //como se fosse: media = media + conjuntoNumeros[a]
	}
	
	System.out.println("Maior: "+maior+". Menor: "+menor+". Média: "+media/conjuntoNumeros.length+".");

	}

}
