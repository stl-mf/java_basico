package br.com.java.basico;

public class TiposVariaveis {

	public static void main(String[] args) {
		//Tipos de dados primitivos
		int a; //numero inteiro
		int b = 10; //numero inteiro
		a = 2;
		
		int soma = a + b;
		int subtracao = a + b;
		int multiplicacao = a * b;
		float divisao = (float)a / b; //representando o resultado int como se fosse float 
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao); //resultado com numeros decimais mesmo com declarando os numeros como tipo inteiros
		System.out.println();
		
		boolean fimDeSemana = true;
		boolean fazendoSol = true;
		boolean vamosAPraia = fimDeSemana && fazendoSol;
		
		//Operador && (AND)
		//Operador || (OR)
		
		System.out.println(vamosAPraia);
		
		//Atribuindo valor baseado em uma condição
		//Para a variável tipo string mensagem recebe operador ternario -> (expressão booleana) ? código 1 : código 2;
		//"Se fimDeSemana for true, 'É fim de semana'. Se for false, 'Não é fim de semana'."
		String mensagem = fimDeSemana ? "É fim de semana." : "Não é fim de semana.";
		System.out.println(mensagem);
		
		
	}

}
