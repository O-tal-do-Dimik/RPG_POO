package Models;

import java.util.Random;

public class Mesa {
	
	private int 	Idmesa;
	private int 	Tamanho;
	private String 	Nomemesa;
	private String  aramazenaNome[];
	
	public Mesa(int idmesa, int tamanho, String nomemesa, String[] aramazenaNome) {
		super();
		Idmesa = idmesa;
		Tamanho = tamanho;
		Nomemesa = nomemesa;
		this.aramazenaNome = aramazenaNome;
	}
	
	// um dado para gerar um numero aleatorio entre 1 e 6
	
	public int dado() {
		Random aleatorio = new Random();
		int d6 = aleatorio.nextInt(6)+1;
		return d6;
	}
	
	// mostrar o nome dos jogadores na mesa
	
	public void Jogadores() {
		for( int i = 0; i <= aramazenaNome.length; i++)
	        System.out.printf( "\n", i, aramazenaNome[i]);
		
	}
	
	public int getIdmesa() {
		return Idmesa;
	}

	public void setIdmesa(int idmesa) {
		Idmesa = idmesa;
	}

	public int getTamanho() {
		return Tamanho;
	}

	public void setTamanho(int tamanho) {
		Tamanho = tamanho;
	}

	public String getNomemesa() {
		return Nomemesa;
	}

	public void setNomemesa(String nomemesa) {
		Nomemesa = nomemesa;
	}

	public String[] getAramazenaNome() {
		return aramazenaNome;
	}

	public void setAramazenaNome(String[] aramazenaNome) {
		this.aramazenaNome = aramazenaNome;
	}
	
	


	
}
