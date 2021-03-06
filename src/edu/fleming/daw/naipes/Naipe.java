package edu.fleming.daw.naipes;

public class Naipe {
	private Palo palo;
	private Id id;
	private int rango;
	
	
	public Naipe(Palo palo, Id id, int rango) {
		this.palo = palo;
		this.id = id;
		this.rango = rango;
	}
	@Override
	public String toString() {
		if(id ==Id.J || id ==Id.Q || id ==Id.K ) {
			return String.format(" La " + id +" De "+ palo + "\n");
		}else 
			return String.format(" El " + id +" De "+ palo + "\n");
	}


	public Palo getPalo() {
		return palo;
	}
	public Id getId() {
		return id;
	}
	public int getRango() {
		return rango;
	}
	public void setRango(int rango) {
		this.rango = rango;
	}


	
	

	
}

