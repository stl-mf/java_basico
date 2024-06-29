package br.com.java.fc;
import java.util.Locale;
import java.util.Scanner;

public class Excecao {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
			
			try {
				System.out.println("Digite seu nome: ");
				String nome = scanner.next();
				
				System.out.println("Digite seu sobrenome: ");
				String sobrenome = scanner.next();
				
				System.out.println("Digite sua idade: ");
				int idade = scanner.nextInt();
				
				System.out.println("Digite sua altura: ");
				double altura = scanner.nextDouble();
				
				//imprimendo os dados obtidos pelo usuario
				System.out.println("Ola, me chamo "+nome.toUpperCase()+" "+sobrenome.toUpperCase());
				System.out.println("Tenho "+idade+" anos");
				System.out.println("Minha altura é "+altura+" cm");
				scanner.close();
			}
			catch (java.util.InputMismatchException x) { //tipo de erro quando o usuario insere os valores não aceitos na idade e altura
				System.err.println("O campos idade e altura precisam ser numericos");
			}
			
		}
	

}
