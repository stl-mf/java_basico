package br.com.java.oo;

import br.com.java.oo.animais.Animal;
import br.com.java.oo.animais.Cachorro;
import br.com.java.oo.animais.Gato;
import br.com.java.oo.animais.Passaro;
import br.com.java.oo.lojas.Petshop;

public class Main {

	public static void main(String[] args) {
		
		/* Polimosrfismo
		Cachorro cachorrinho = new Cachorro("Mel", "Preto", 0.8, 2, 1, "nada");
		Gato gatinho = new Gato("Lulu", "Preto", 8.0);
		Passaro passarinho = new Passaro("Rex", "Cinza", 0.3);
		
		//criando objeto Petshop
		Petshop petshop = new Petshop();
		
		//método do petshop
		petshop.darBanho(cachorrinho);
		System.out.println(cachorrinho.getNome()+" está "+cachorrinho.getEstadoDeEspirito());
		
		petshop.deixarNoHotel(passarinho);
		System.out.println(passarinho.getNome()+" está "+passarinho.getEstadoDeEspirito());
		*/
		
		//(Classe de referencia) = (Classe verdadeira)
		Gato gato1 = new Gato("Lulu", "Preto", 8.0);
		Animal gato2 = new Gato("Blue", "Preto", 8.0); //todo gato é um animal
		//Gato gato3 = new Animal("Tri", "Branco", 3.0); //erro, pois: mas nem todo animal é um gato
		//Animal gato4 = new Animal("Tri", "Branco", 3.0); //com a classe abstrata Animal, não é mais permitido criar um objeto Animal-Animal
		
		gato1.soar();
		gato2.soar();
		
	}

}
