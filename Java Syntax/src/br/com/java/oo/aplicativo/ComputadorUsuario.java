package br.com.java.oo.aplicativo;

import java.util.Scanner;

public class ComputadorUsuario {

	public static void main(String[] args) {
		/*
		System.out.println("MSN");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		System.out.println("Facebook");
		FacebookMessenger fc = new FacebookMessenger();
		fc.enviarMensagem();
		fc.receberMensagem();
		
		System.out.println("Telegram");
		TelegramMessenger tl = new TelegramMessenger();
		tl.enviarMensagem();
		tl.receberMensagem();
		*/
		Scanner scanner = new Scanner(System.in);
		
		ServicoMensagemInstantanea smi = null;
		
		System.out.println("Escolha o sistema:");
		System.out.println("MSN, Face ou Telegram");
		String appEscolhido = scanner.next();
		
		//String appEscolhido = "msn";
		
		
		if (appEscolhido.equals("MSN"))
			smi = new MSNMessenger();
		else if (appEscolhido.equals("Face"))
			smi = new FacebookMessenger();
		else if (appEscolhido.equals("Telegram"))
			smi = new TelegramMessenger();
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}

}
