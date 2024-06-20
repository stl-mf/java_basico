package br.com.java.fc;

public class Ternaria {

	public static void main(String[] args) {
		//ResultadoEscolar
		
		int nota = 1;
		
		/** duas condicionais
		String resultado = nota >=7 ? "Aprovado" : "Reprovado"; //refatorando
		System.out.println(resultado);
		*/
		
		//três condicionais
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7? "Recuperação" : "Reprovado";
		System.out.println(resultado);
		
	}

}
