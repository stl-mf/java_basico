package edu.java.oo;

import edu.java.oo.animais.Cachorro;
import edu.java.oo.animais.Gato;
import edu.java.oo.animais.Passaro;

public class ONG {

	public static void main(String[] args) {
		Cachorro cachorroUm = new Cachorro("Amora", "Preto", 0.8, 2, 1, "nada");
		Gato gatoUm = new Gato("Neko", "Preto", 8.0);
		Passaro passaroUm = new Passaro("Bob", "Cinza", 0.3);
	
		//System.out.println(cachorroUm.soar());
		
		cachorroUm.soar(); //método herdado com funcionalidade diferente
		gatoUm.soar();
		passaroUm.soar();
		
		
	}

}
