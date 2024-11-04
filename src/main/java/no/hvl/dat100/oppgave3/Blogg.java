package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;

import no.hvl.dat100.oppgave1.*;


public class Blogg {

	// TODO: objektvariable 
	private Innlegg[]tabell;
	private int nesteledige;
	
	
	public Blogg() {
	
		tabell = new Innlegg[20];
		nesteledige = 0;
	
	}

	public Blogg(int lengde) {
		
		tabell = new Innlegg[lengde];
		nesteledige = 0;
		
	}

	public int getAntall() {
		return this.nesteledige;
	}
	
	public Innlegg[] getSamling() {
		return tabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		boolean funnet = false;
		int pos = 0;
		while (pos<this.nesteledige && !funnet ) {
			
			if(tabell[pos].erLik(innlegg)) {
				funnet = true;
				
			}else {
				pos++;
			}
			
		}
		if(funnet) {
			return pos;
		}
		else {
			return -1;
		}
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = false;
		
		int pos = finnInnlegg(innlegg);
		if(pos >= 0) {
			finnes = true;
		}
		
		return finnes;
		
	}

	public boolean ledigPlass() {
	
		if(this.nesteledige  < this.tabell.length) {
			return true;
		}
			return false;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		
		if(ledigPlass() && !finnes(innlegg)) {
			
			tabell[nesteledige] = innlegg;
			nesteledige = nesteledige + 1;
			return true;
		}
		else return false;
	}
	
	public String toString() {
		int pos= 0;
		String tekst = "";
		
		for(pos = 0; pos < tabell.length; pos++) {
		
		tekst = tekst + tabell[pos].toString();
			
		}
		tekst = nesteledige +"\n"+ tekst;
		
		return tekst;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}

}