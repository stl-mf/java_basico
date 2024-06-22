package br.com.java.fc;

public class InterrompeContinua {

	public static void main(String[] args) {
		/*
		//break
		for (int numero = 1; numero < 5; numero++) {
			if (numero == 3) //quando chegar no 3 irá interromper e não vai imprimir
				break;
			
			System.out.println(numero);
		}
		*/
		
		//continue
		for (int numero = 1; numero <=5; numero++) {
			if (numero == 3) //quando chega no indice 3, interrompe e depois continua normal
				continue;
			
			System.out.println(numero);
		}

	}

}
