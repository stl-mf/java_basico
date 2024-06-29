package br.com.java.fc;
import java.util.Random;

public class FacaEnquanto {
	public static void main(String[] args) {
		System.out.println("Discando...");
		
		do {
			System.out.println("Telefone tocando"); //executando retidas vezes até atender
		} while (tocando());
		
		
		System.out.println("Alô!!!"); //quanto "atendeu" for true imprimirá "Alô!!

	}
	
	//método para telefone que determina se está tocando
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1; //se entre 1 e 3 for igual a 1, então ele atendeu
		System.out.println("Atendeu? "+atendeu);
		
		return ! atendeu; //negando o ato de continuar tocando
	}

}
