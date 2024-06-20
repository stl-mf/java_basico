package br.com.java.oo.lojas;

import br.com.java.oo.animais.Animal;
import br.com.java.oo.animais.Cachorro;

public class Petshop {
	public void darBanho(Animal animal) {
		animal.setEstadoDeEspirito("Limpo");
	}
	
	public void tosar(Cachorro cachorro) {
		cachorro.setEstadoDeEspirito("tosado");
	}
	
	public void deixarNoHotel(Animal animal) {
		animal.setEstadoDeEspirito("com saudade");
	}
}
