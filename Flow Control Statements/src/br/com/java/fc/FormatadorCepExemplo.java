package br.com.java.fc;

public class FormatadorCepExemplo {
	//duas maneiras de conversão de uma String para um numero, porém o texto contém Alfanuméricos

	public static void main(String[] args) {
		try {
			String cepFormatado = formatarCep ("1234568");
			System.out.println(cepFormatado);
		} catch (CepInvalido e) {
			System.out.println("Cep invalido.");
		}

	}
	
	public static String formatarCep(String cep) throws CepInvalido{
		if (cep.length() != 8)
			throw new CepInvalido();
		
			//simulando um cep formatado
			return "23.765-864"; //verificar melhorias aqui
	}

}
