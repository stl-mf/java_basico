package br.com.java.basico;

public class LacosNumericos {

	public static void main(String[] args) {
		//Proposta:
		// 1 2 3 4 5 6 7 8 9 10
		
		//de um em um
		System.out.print("Primeira proposta: ");
		for (int i = 1; i <=10; i++) { //int = i: variavel de controle,i++: incrementando um por um
			System.out.print(i+", ");
		}
		

		/*de dois em dois
		for (int i = 1; i <=10; i+=2) { //int = i: variavel de controle,i++: incrementando um por um
			System.out.println(i);
		}
		**/
		
		System.out.println();
		
		//Proposta:
		//tabuada
		for (int a = 1; a <= 10; a++) { //1 ao 10
			for (int b = 1; b <= 10; b++) {
				System.out.println(b +" x "+a+" = "+ b * a);
				
			}
			System.out.println();
		}	
		
		//Extra
		//Poder escolher qual tabuada calcular, ex: tabuada do 3.
		int tabuada = 3;
		System.out.println("Segue a tabuada do: "+tabuada);
		
		for (int z = 1; z<= 10; z++) {
			System.out.println(z+" x "+tabuada+" = "+ z*tabuada);
		}
		
	}

}
