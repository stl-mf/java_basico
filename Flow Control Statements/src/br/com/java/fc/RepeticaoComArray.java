package br.com.java.fc;

public class RepeticaoComArray {
	public static void main (String [] args) {
		String animes [] = {"Clnnad", "Shingeki no Kyojin", "Tokyo Ghoul", "Boku no Hero"};
	
		/*
		for (int x = 0; x < animes.length; x++) {
			System.out.println("Anime no indice "+x+" é o "+animes[x]);
		}
		*/
		
		//De outra forma (for each)
		for (String anime : animes) { //tipo dos elementos do arrays é do tipo String
			System.out.println("Nome do anime é: "+anime);
		}
		
	}

	
}
