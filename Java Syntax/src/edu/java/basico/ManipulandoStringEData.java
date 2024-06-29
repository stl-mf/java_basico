package edu.java.basico;

import java.time.LocalDate; //data da semana
import java.time.format.TextStyle; //para o nome completo do texto (diaDaSemana)
import java.util.Locale; //local para traduzir o nome completo da variavel diaDaSemana
import java.time.LocalDateTime; //para hora

public class ManipulandoStringEData {

	public static void main(String[] args) {
		//Proposta:
		//Olá {nome}. Hoje é {diaDaSemana}, {saudação}!
		
		String nome = "Julia";
		
		
		//ISO 8601 (AAAA/MM/DD) -> formato padrão para o mundo inteiro
		//variavel "hoje" do tipo LocalDate recebe metodo do LocalDate "now" (data atual)
		LocalDate hoje = LocalDate.now();
		//System.out.println(hoje); -> retorna a data no padrão ISO 8601
		//System.out.println(hoje.getDayOfWeek()); -> retorna o dia da semana, ex: SUNDAY
		
		//Traduzindo o dia da semana para pt-br
		//variavel "brasil" do tipo Locale
		Locale brasil = new Locale("pt", "BR"); //Locale (language: "pt", contry: "BR")
		
		//irá apresentar o dia da semana com a seguinte formatação: o nome completo no formato do brasil
		//System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
		String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
		
		//Descobrindo as horas
		String saudacao;
		//variavel "agora" do tipo LocalDateTime recebe metodo do LocalDateTime "now" (hora atual)
		LocalDateTime agora = LocalDateTime.now();
		if (agora.getHour() >= 0 && agora.getHour() <12) { //getHour() -> pegando só a hora
			saudacao = "bom dia";
		} else if (agora.getHour() >=12 && agora.getHour() < 18) {
			saudacao = "boa tarde";
		} else if (agora.getHour() >= 18 && agora.getHour() < 24) {
			saudacao = "boa noite";
		} else {
			saudacao = "";
		}
		
		//Apresentando:
		System.out.printf("Olá, %s. Hoje é %s. %s!.%n", nome, diaDaSemana, saudacao.toUpperCase()); //printf: definimos o formato e depois os valores, %n: quebra de linha, %s: variável tipo string 
		
	}

}
