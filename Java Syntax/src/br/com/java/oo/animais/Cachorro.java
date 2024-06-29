package br.com.java.oo.animais;

public class Cachorro extends Animal { //(vai receber todas as caracteristicas da classe Animal)
	
	//Atributos (de todos os objetos Cachorros):
	static int numeroDeCachorros; //variável estatica para contar quantos objetos foram criados
	
	private int tamanhoDoRabo;
	
	//Construtores padrão sem parâmetro
	public Cachorro() {}
	
	//Contrutores adicionados
	public Cachorro(String nome, String cor, double altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
		super(nome, cor, peso);
		this.nome = nome;
		this.cor = cor;
		this.altura = altura;
		this.peso = peso;
		this.tamanhoDoRabo = tamanhoDoRabo;
		this.estadoDeEspirito = estadoDeEspirito;
		
		numeroDeCachorros ++; //equivalente: numeroDeCachorros = numeroDeCachorros + 1. Irá somar 1 a cada criação de Cachorro pelo construtor
	}


	//Métodos:
	public static int getNumeroDeCachorros() {
		return numeroDeCachorros;
	}

	public static void setNumeroDeCachorros(int numeroDeCachorros) {
		Cachorro.numeroDeCachorros = numeroDeCachorros;
	}
	
	//getters (pegar)
	public String getNome() { // 
		return this.nome;
	}
	
	//setters (colocar)
	public void setNome(String nome) {
		
		this.nome = nome; //o atrbuto nome recebe o parametro String nome
	}
	
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getTamanhoDoRabo() {
		return tamanhoDoRabo;
	}

	public void setTamanhoDoRabo(int tamanhoDoRabo) {
		this.tamanhoDoRabo = tamanhoDoRabo;
	}

	public String getEstadoDeEspirito() {
		return estadoDeEspirito;
	}

	public void setEstadoDeEspirito(String estadoDeEspirito) {
		this.estadoDeEspirito = estadoDeEspirito;
	}

	
	//Continuação de métodos:
	
	public String pegar() { //quando o método não é reclarado com "void", ele irá retornar algo
		return //quando resejamos que ele retorne algo
				"Bolinha";
	}
	
	/*
	if-else
	public String interagir(String acao) { //recebe a "acao"
		//controle de fluxo
		if (acao.equalsIgnoreCase("Carinho")) { //valida a "acao" -> se acao for igual a "Carinho"
			this.estadoDeEspirito = "feliz"; 
		} else if (acao.equalsIgnoreCase("vai dormir")){
			this.estadoDeEspirito = "bravo";
		} else {
			this.estadoDeEspirito = "neutro";
		}
		return estadoDeEspirito; //sempre irá retornar
	}
	**/
	
	//switch
	public String interagir (String acao) {
		switch (acao) {
		case "carinho": this.estadoDeEspirito = "feliz"; break;
		case "vai dormir":this.estadoDeEspirito = "bravo"; break;
		case "pisar na patinha": this.estadoDeEspirito = "triste"; break;
		default: this.estadoDeEspirito = "neutro"; break;
		
		}
		return this.estadoDeEspirito;
	}
	
	
	@Override
	public String toString() {
		return "Cachorro [nome=" + nome + "]";
	}

	@Override //Método que foi herdado. Mesmo nome, mas com funcionalidades distintas
	public void soar() {
		System.out.println("AU AU!");
	}
	
	
	
	
	
}
