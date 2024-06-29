package br.com.java.fc;

public class RepeticaoComArray {
	public static void main (String [] args) {
		/*
		String animes [] = {"Clnnad", "Shingeki no Kyojin", "Tokyo Ghoul", "Boku no Hero"};
	
		
		for (int x = 0; x < animes.length; x++) {
			System.out.println("Anime no indice "+x+" é o "+animes[x]);
		}
		
		
		//De outra forma (for each)
		for (String anime : animes) { //tipo dos elementos do arrays é do tipo String
			System.out.println("Nome do anime é: "+anime);
		}
		*/
		imprimirSelecionados();
		
		
	}
	
	static void imprimirSelecionados() {
		String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		
		System.out.println("- Imprimindo a lista de candidatos informando o indice do elemento");
		
		for (int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de nº "+(indice+1)+" é o(a) "+candidatos[indice]);
		}
		
		System.out.println("\n- Forma abreviada de interação for each");
		
		for (String candidato : candidatos) {
			System.out.println("O candidato selecionado foi "+candidato);
		}
	}

	
}
