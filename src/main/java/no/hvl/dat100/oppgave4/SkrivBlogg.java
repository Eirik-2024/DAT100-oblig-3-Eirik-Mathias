package no.hvl.dat100.oppgave4;

import java.io.PrintWriter;

import no.hvl.dat100.oppgave1.Innlegg;
import no.hvl.dat100.oppgave3.Blogg;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
try {		
		String filMappe = mappe + "/" + filnavn;
		PrintWriter skriver = new PrintWriter(filMappe);
		
		
		Innlegg print[] = samling.getSamling();
		
		String printSTR = "";
		for(int i = 0; i < samling.getAntall(); i++) {
		printSTR = printSTR + print[i].toString();

		}
		printSTR = samling.getAntall() +"\n"+ printSTR;
		skriver.println(printSTR);
		
		skriver.close();
		return true;
		
}catch(Exception e) {
 return false;
}
	}
}
