/**
@author stl-mf
@version 2.0
@since 05/06/2024
*/

package br.com.java.basico;

public class MinhaClasse { //PascalCase para classe

	public static void main(String[] args) { //main método
		
		//variáveis
		String umNome = "Lucas";
		int umaIdade = 23;
		double umaAltura = 1.67;
		boolean umaPessoa = true;
		
		System.out.println("TIPOS DE VARIÁVEIS");
		System.out.println("O nome é: "+umNome+". Tipo de dado String.");
		System.out.println("A idade é: "+umaIdade+". Tipo de dado inteiro.");
		System.out.println("A altura é: "+umaAltura+". Tipo de dado double/float.");
		System.out.println("É uma pessoa: "+umaPessoa+". Tipo de dado boolean.");
		
		//Métodos
		String primeiroNome = "Ana";
		String segundoNome = "Maria";
				
		String nomeCompleto = nomeConcatenado (primeiroNome,segundoNome); //Variável nomeCompleto, seu valor é a chamada de um método, nomeConcatenado no caso
		
		System.out.println(" ");
		System.out.println("TIPOS DE MÉTODOS");
		System.out.println("O primeiro nome é: "+primeiroNome);
		System.out.println("O segundo nome é: "+segundoNome);
		
		//Imprimindo a variavel com o valor de um método
		System.out.println(nomeCompleto);
		
	}
	
	//Método nomeConcatenado com dois parametros, primeiroNome e segundoNome
	public static String nomeConcatenado (String primeiroNome, String segundoNome) {
		//concatenado com uma String e com o método concat
		return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
	}

}
