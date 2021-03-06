package ippocrates;
import java.util.*;

public class Ricetta implements Prescrizione {
	
	private ArrayList<Farmaco> listaFarmaci;
	
	public Ricetta() {
		this.listaFarmaci = new ArrayList<Farmaco>();
	}

	@Override
	public void inserisciElemento(Elemento e) {
		Farmaco f = (Farmaco) e;
		this.listaFarmaci.add(f);
	}

	@Override
	public ArrayList<Elemento> getLista() {
		ArrayList<Elemento> l = new ArrayList<Elemento>(this.listaFarmaci);
		return l;
	}

}
