package edu.java.oo.aplicativo;

public class TelegramMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram Messenger.");
		salvarHistorico();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram Messenger.");
		
	}

	

}
