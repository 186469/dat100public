package Uke37;

public class OppgaveG1 {

	public static void main(String[] args) {

		// Her vi det printes først
		// Test av repitisjonsdag
		//************************
		// Når i = 4, 8. vil den lage et mellomrom så printe det.
		// Den vil skriv ut alle linjene og skrive "Dette er linje nr i"
		
		int i;

	    System.out.println("Test av repetisjonssetning.");
	    System.out.println("***************************");

	    i = 1;

	    while (i <= 10) {
	      System.out.println("Dette er linje nr. " + i);

	      if (i == 4) {
	        System.out.println();
	      }

	      if (i == 8) {
	        System.out.println();
	      }

	      i = i + 1;
	    }
	  }
	
			
	}


