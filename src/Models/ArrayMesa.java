package Models;

import java.util.ArrayList;

public class ArrayMesa {

	private ArrayList<Mesa> m1;
	
	public ArrayMesa() {
		m1 = new ArrayList<Mesa>();
	}
	
	public ArrayList<Mesa> getm1() {
		return this.m1;
	}
	
	public void addMesa(Mesa mesa) {
		this.m1.add(mesa);
	}
	
	public void removeMesa(Mesa mesa) {
		this.m1.remove(mesa);
	}
	
	public void apagaMesas() {
		this.m1.clear();
	}

	public int size() {
		return this.m1.size();
	}

	public Mesa get(int i) {
		return this.m1.get(i);
	}
	
//	public void getMesas() {
//		this.m1.clear();
//	}
	
}
