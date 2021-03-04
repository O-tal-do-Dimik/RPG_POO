package Models;

import java.util.ArrayList;
import java.util.Scanner;

public class Mestre  {	
 
//public Mesa m1;
	

	
ArrayMesa m1;

public Mestre() {
	super();
	this.m1 = new ArrayMesa();
}


public void CriarNPC() {
	Scanner input2 = new Scanner(System.in);
	System.out.println("Digite O Nome, A Classe e os Seguintes Atributos em Sequencia Força,Resistencia,Poder de Fogo,Habilidade e Armadura");	
		Ficha_Personagem f1 = new Ficha_Personagem(input2.nextLine(),input2.nextLine(),input2.nextInt(),input2.nextInt(),input2.nextInt(),input2.nextInt(),input2.nextInt());
	System.out.println("Nome:"+f1.getNome());
	System.out.println("Classe:"+f1.getClasse());
	System.out.println("Força:"+f1.getForca());
	System.out.println("Resistencia:"+f1.getResistencia());
	System.out.println("Poder de Fogo:"+f1.getPoderdefogo());
	System.out.println("Habilidade:"+f1.getHabilidade());
	System.out.println("Armadura:"+f1.getArmadura());
	System.out.println("Pontos de Vida:"+f1.getHp());
	System.out.println("Pontos de Magia:"+f1.getMp());
}
	

public void CriaMesa() {
	Mesa mesa;	
		Scanner input = new Scanner(System.in);
		System.out.println("Crie nome da mesa o id da sala e diga o numero de jogadores");
		
		mesa = new Mesa(input.nextLine(),input.nextInt(),input.nextInt());
		m1.addMesa(mesa);
		System.out.println("Sala criada!!");	
		int n = m1.size();
	    System.out.println(n);
}

public void MostraMesa() {
				

			
		
		//System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
		
	    int n = m1.size();
	    System.out.println(n);
	    
	    int i;
	    for (i=0; i<n; i++) {
	    	
	    	Mesa m_aux = m1.get(i);
			System.out.println("o Nome da sua Mesa:"+m_aux.getNomemesa());
			System.out.println("Players na mesa:"+m_aux.getTamanho());
			System.out.println("Id da Mesa:"+m_aux.getIdmesa());
	
	    }
	}



public void ApagarMesa() {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Digite o id da mesa que quer apagar");
	
    int n = m1.size();
	
    int i;
    
    for (i=0; i<n; i++) {
    	
    	Mesa m_aux = m1.get(i);
		System.out.println("o id da mesa:"+m_aux.getIdmesa());
		
		if(m_aux.getIdmesa() == input.nextInt() ) {
			m1.removeMesa(m_aux);
			System.out.println("Mesa Apagada");
		}
		
    }
	
	
//		System.out.println("Voce esta Apagando uma Mesa!");
//				m1.setTamanho(0);
//				m1.setNomemesa(null);
//				m1.setIdmesa(0);
	
	
}


}
