package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
<<<<<<< Updated upstream
=======
	// TODO - deklarering av objektvariable
>>>>>>> Stashed changes
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
<<<<<<< Updated upstream
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
=======
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

>>>>>>> Stashed changes
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		
<<<<<<< Updated upstream
	
=======
>>>>>>> Stashed changes
	}
	
	public String getBruker() {
		return this.bruker;
		
<<<<<<< Updated upstream
	}

	public void setBruker(String bruker) {
=======
		return bruker;

	}

	public void setBruker(String bruker) {
		
>>>>>>> Stashed changes
		this.bruker = bruker;
	}

	public String getDato() {
<<<<<<< Updated upstream
		return this.dato;
=======
>>>>>>> Stashed changes
		
		return dato;
	}

	public void setDato(String dato) {
<<<<<<< Updated upstream
=======
		
>>>>>>> Stashed changes
		this.dato = dato;
	}

	public int getId() {
<<<<<<< Updated upstream
		return this.id;
		

	}

	public int getLikes() {
		return this.likes;
		

	}
	
	public void doLike () {
		this.likes = likes +1; 
=======
		
		return id;
	}

	public int getLikes() {
	
		return likes;
	}
	
	public void doLike () {
	
		this.likes += 1;
>>>>>>> Stashed changes
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		if(innlegg == null || innlegg.getId() != id) {
			return false;
		}
		else {
			return innlegg.getId() == id;
		}
	}
	
	@Override
	public String toString() {
		
<<<<<<< Updated upstream
String str = "";
        
        str += id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
        
        return str;
		
=======
		String tekst = "" + id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
		
	return tekst;
>>>>>>> Stashed changes
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
