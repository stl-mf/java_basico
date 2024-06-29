package edu.java.oo.aplicativo;

public class FacebookMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger.");
		salvarHistorico();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger.");
		
	}

}
