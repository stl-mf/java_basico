package edu.java.oo.veiculos;

public abstract class Veiculo { //abstração
	//ATRIBUTO
		private String chassi;
		
	//MÉTODOS
		
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public abstract void ligar(); //abstração com uma finalidade
}
