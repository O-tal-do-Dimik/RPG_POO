package Main;

import java.util.Scanner;
import Models.ArrayJogadores;
import Models.Jogador;
import Models.Mesa;
import Models.Mestre;

public class Principal {
	
	
	public static void main(String[] args) {
		ArrayJogadores jogadores = new ArrayJogadores();
		Scanner input2 = new Scanner(System.in);
		boolean temMestre = false;
		int nextInt;
		int opcao;
		Mestre m1 = new Mestre();
		System.out.println("Você deseja selecionar 1-Mestre ou 2-Jogador:");

		do { 
					Scanner menu = new Scanner (System.in);
					System.out.println("Ola Mestre");
					System.out.println("Digite 1 para criar mesa");
					System.out.println("Digite 2 para apagar uma mesa");
					System.out.println("Digite 3 para ver suas mesas");
						 
					opcao = menu.nextInt();
					switch (opcao) {
					case 1:System.out.print("Criando mesa\n");
						m1.CriaMesa();
						break;
					case 2:System.out.print("Mesas para pagar\n");
						m1.ApagarMesa();
						break;
					case 3:System.out.print("Suas mesas\n");
						m1.MostraMesa();
						break;
					}
						
						
		}while(opcao!= 999);		
	} 
				
}
	
