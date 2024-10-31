package zoomOppgaver;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {

		int[][] tabell = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
		
		skrivUt(tabell);
	}
	
	public static void skrivUt(int[][] tabell) {
		
		int antall = tabell.length;
		int kolonne = tabell[0].length;
		
		for (int i = 0; i < antall * kolonne; i++) {
			
			int antallRad = i / kolonne;
			int antallKolonne = i % kolonne;
			
			System.out.print(tabell[antallRad][antallKolonne] + " ");
			
			if (kolonne == antallKolonne - 1) {
				System.out.println();
			}
		}
		
	}
}

	

	

		
		
	



