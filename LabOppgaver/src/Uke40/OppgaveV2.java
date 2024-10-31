package Uke40;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class OppgaveV2 {

	public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Hvor mange ord vil du sette inn?");
	    int antallOrd = scanner.nextInt();
	    scanner.nextLine();
	    
	    String[]tabell = new String[antallOrd];
	    
	    for (int i = 0; i < tabell.length; i++) {
	    	System.out.print("Skriv inn ordene " + (i+1) + ": ");
	    	tabell[i] = scanner.nextLine();
	    }
	    // Oppgave a
//	    System.out.println("Her er ordene du la inn.");
//		for (String ordene : tabell) {
//			System.out.println(ordene);
//		}
	    System.out.println("Skriv inn et mønster du søker etter");
	    String mønster = scanner.nextLine();
	    
	    int antall = 0;
	    for (String ord : tabell) {
	    	if (ord.contains(mønster)) {
	    		System.out.println(mønster);
	    		antall++;
	    	}
	    }
	    System.out.println("Antall ord som inneholder mønsteret '" + mønster + "'" + " er " + antall + " ord");
	    
		scanner.close();
	}

}
