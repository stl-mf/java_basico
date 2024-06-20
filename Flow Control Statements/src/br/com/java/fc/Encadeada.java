package br.com.java.fc;
import java.util.Scanner; //importando scanner

public class Encadeada {
	
	public class NotaProva {
		
		public static void main (String[] args) {
			Scanner scanner = new Scanner(System.in); //"lingando" método
		
			System.out.println("Qual prova foi realizada?");
			String prova = scanner.next(); //determinando a entrada pelo scanner
			
			if (prova.equals("Artes")) { //condicional 1 (se prova for igual a "Artes")
				System.out.println("Quantas questões acortou?");
				int nota = scanner.nextInt(); //determinando outra entrada pelo scanner
				
				if (nota >= 7) { //condicional 1.1
					System.out.println("Parabéns! Você foi aprovado.");
				} else if (nota >= 5 && nota < 7){ //condicional 1.2
					System.out.println("Atenção! Você ficou de recuperação.");
				} else { //condicional 1.3
					System.out.println("Você foi reprovado.");
				}
			} else { //condicional 2
				System.out.println("Matéria da prova invalida");
			}
			
			scanner.close(); //"fechando" scanner
	
		}
	}	

}
