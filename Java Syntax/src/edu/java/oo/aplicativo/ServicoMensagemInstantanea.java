package edu.java.oo.aplicativo;

public abstract class ServicoMensagemInstantanea {
	//MÉTODOS
		public abstract void enviarMensagem();
		public abstract void receberMensagem();
		
		
		/* Aplicando encapsulamento e herança
		public void enviarMensagem() {
			validarConectadoInternet(); //aglomerando funcionalidades -> encapsulamento
			System.out.println("Enviando mensagem.");
			salvarHistorico(); //aglomerando funcionalidades -> encapsulamento
		}
		public void receberMensagem() {
			System.out.println("Recebendo mensagem.");
		}
		
		//métodos privadas, visiveis comente na classe
		private void validarConectadoInternet() {
			System.out.println("Validando se está conectado a internet.");
		}
		private void salvarHistorico() {
			System.out.println("Salvando o histórico da mensagem.");
		}
		*/
		
		protected void validarConectadoInternet() {
			System.out.println("Validando se está conectado a internet.");
		}
		
		protected void salvarHistorico() {
			System.out.println("Salvando o histórico da mensagem.");
		}

}
