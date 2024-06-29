package edu.java.oo.aplicativo;

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
		
		System.out.println("Aplicativos de Mensagens Instantaneas");
		System.out.println("1 - MSN\n2 - Facebook\n3 - Telegram");
		System.out.println("Escolha um aplicativo: ");
		int appEscolhido = scanner.nextInt();
		
		//String appEscolhido = "msn";
		
		
		if (appEscolhido == 1)
			smi = new MSNMessenger();
		else if (appEscolhido == 2)
			smi = new FacebookMessenger();
		else if (appEscolhido == 3)
			smi = new TelegramMessenger();
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}

}
