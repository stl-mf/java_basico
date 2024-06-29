package br.com.java.desafio.candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		
		System.out.println("Processo seletivo\n");
		
		String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		
		for (String candidato : candidatos) {
			entrandoEmContato(candidato);
		}
		
	}
	
	//metodo
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1; //ligamos
		boolean continuarTentando = true; //continuar tentando pois acabamos de ligar para o candidato
		boolean atendeu = false; 
		do { //para executar primeiro e depois determinar se deve continuar a logica da ligação
			atendeu = atender(); //se o numero aleatório gerado for igual a 1, ele atendeu, senão ele retorna false e continuar tentanto
			continuarTentando = !atendeu; //continua tentando se for oposto de atendeu (ou seja, se for oposto de true)
			if (continuarTentando) //continuarTentando == true
				tentativasRealizadas++; //soma mais uma tentativa
			else
				System.out.println("\nContato realizado com sucesso!"); //se continuarTentando == false, o candidato atendeu
			
		} while(continuarTentando && tentativasRealizadas < 3); //numero de tentativas realizadas sejam inferior a 3
		
		if (atendeu) //se atendeu, atendeu == true
			System.out.println("Conseguimos contato com "+candidato+" na "+tentativasRealizadas+"º tentativas.\n");
		else //atendeu == false
			System.out.println("Não conseguimos contato com "+candidato+", número máximo tentativas "+tentativasRealizadas+" realizadas.");
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1; //retorna quando um numero aleatorio entre 1 e 3 for igual a 1, ele irá "atender"
		
	}
	
	static void selecaoCandidatos() {
		String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "CAIO"};
	
		int candidatosSelecionados = 0; //contador para os candidatos que foram selecionados (salarioBase > salarioPretendido)
		int candidatosAtual = 0; //contador para percorrer o array
		double salarioBase = 2000.0; 
		
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) { //e só posso selecionar pessoas para eu buscar na minha lista de candidaturas
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato "+candidato+" solicitou este valor de salário "+salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato "+candidato+" foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatosAtual++;
				
		}
	
		
		
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	
	static void analisarCandidato(double salarioPretendido) { //vamos comparar os dois salarios (base e pretendido), como só o pretendido vai varial, colocamos como parametro
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato.");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para candidato com contra proposta.");
		} else {
			System.out.println("Aguardando demais candidatos.");
		}
	}
}
