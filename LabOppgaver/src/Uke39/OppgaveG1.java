package Uke39;

public class OppgaveG1 {

	public static void main(String[] args) {
		
		int[] tabell = {1, 3, 4, 7, 9, 10};
		tabell[2] = 7;
		
		skrivUt(tabell);
		System.out.println();
		
		int tall = 9;
		boolean detFinnes = finnes(tabell, tall);
		System.out.println("Finnes tallet " + tall + " i tabellen? " +detFinnes);
		
		int[]nyTabell = skiftfortegn(tabell);
		skrivUt(nyTabell);
		
	}
	public static void skrivUt(int[] tab) {
		for (int verdi : tab) {
			System.out.print(verdi + " ");
		}
			
	}
	public static boolean finnes(int[] tabell, int tall) {
		int i = 0;
		while (i < tabell.length) {
			if (tall == tabell[i]) {
				return true;
			}
			i++;
		}
		return false;
	}
	public static int[] skiftfortegn (int[] tabell) {
		int[] nyTabell = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			nyTabell[i] = tabell[i] * -1;
		}
		return nyTabell;
	}
	
	}
	





