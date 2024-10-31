package zoomOppgaver;

import java.util.Arrays;

public class chatGPTOppgaver {

	public static void main(String[] args) {
		
		int[][] temp = {
                {2, 4, 5, 4, 6, 7, 4},
                {5, 4, 7, 3, 4, 6, 7},
                {6, 5, 4, 7, 8, 4, 3},
                {6, 7, 5, 8, 9, 10, 9},
                {7, 6, 8, 9, 6, 5, 9},
                {10, 11, 11, 12, 10, 9, 9},
                {9, 8, 12, 11, 10, 15, 13}
        };
		
		// Lager  kopier av koden slik at den opprinnelige ikke endres
		int[][]kopi1 = tabellKopi(temp);
		int[][]kopi2 = tabellKopi(temp);
		
		
		// gjen-metoden
		double gjennomsnitt = gjen(temp);
		String resultat = String.format("%.3f", gjennomsnitt);
		System.out.println("Gjennomsnittstemeraturen er " + resultat);
		
		
		System.out.println();
		
		// finnMaks-metoden
		int max = finnMaks(temp);
		System.out.println("Den høyeste temperaturen er " + max);
		
		
		System.out.println();
		
		// summerRader-metoden
		int[]sum = summerRader(temp);
		for (int i = 0; i < sum.length; i++) {
			System.out.println("Sum for rad " + i + " er " + sum[i]);
		}
		System.out.println();
		
		// gjennomsnittKolonner-metoden
		double[]gjen = gjennomsnittKolonner(temp);
		for (int i = 0; i < gjen.length; i++) {
			System.out.println(String.format("Gjennomsnitt for hve kolonne er: %.2f", gjen[i]));
		}
		System.out.println();
		
		
		// finnAntall-metoden
		int tall = 4;
		int tallet = finnAntall(temp, tall);
		System.out.println("Tallet " + tall + " er gitt " + tallet + " i tabellen.");
		
		System.out.println();
		
		
		int sum1 = diagonaleSum(temp);
		System.out.println(sum1);
		
		
		System.out.println();
		
		int grense = 13;
		nullstillOverGrense(kopi1, grense);
		skrivUt2DTabell(kopi1);
			
		
		System.out.println();
		
		// transponer-metoden
		System.out.println("Rad 1 og 2 byttet med rad 6 og 7");
		int[][]endretTab = byttRader(kopi2);
		for (int i = 0; i < endretTab.length; i++) {
			for (int j = 0; j < endretTab[i].length; j++) {
				System.out.print(String.format("%4d", endretTab[i][j]));
			}
			System.out.println();
		}
		System.out.println();
				
		
		
	}
	
	// Lager en metoden for å kopiere tabellen
	public static int[][] tabellKopi(int[][] orginal) {
		int[][] kopi = new int[orginal.length][];
		for (int i = 0; i < orginal.length; i++) {
			kopi[i] = orginal[i].clone();  
		}
		return kopi;
	}
	
	public static void skrivUt2DTabell(int[][] tab) {
	    for (int i = 0; i < tab.length; i++) {
	        for (int j = 0; j < tab[i].length; j++) {
	            System.out.print(String.format("%4d", tab[i][j]));
	        }
	        System.out.println();
	    }
	    
	   
	    
	}
	public static double gjen(int[][] tab) {
		
		double sum = 0;
		double elementer = 0;
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				sum += tab[i][j];
				elementer++;
			}
		}
		return sum / elementer;
	}
	
	public static int finnMaks(int[][] tab) {
		
		int start = tab[0][0];
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (tab[i][j] > start) {
					start = tab[i][j];
				}
			}			
		}
		return start;		
	}
	
	public static int[] summerRader(int[][] tab) {
		
		int sumRader[] = new int[tab.length];
		
		for (int i = 0; i < tab.length; i++) {
			int sum = 0;
			for (int j = 0; j < tab[i].length; j++) {
				sum += tab[i][j];
			}
			sumRader[i] = sum;
		}
		return sumRader;
	}
	
	public static double[] gjennomsnittKolonner(int[][] tab) {
		
		double gjenRader[] = new double[tab.length];
		
		for (int i = 0; i < tab.length; i++) {
			double sum = 0;
			for (int j = 0; j < tab[i].length; j++) {
				sum += tab[i][j];
			}
			gjenRader[i] = sum / tab.length;
		}
		return gjenRader;
	}
	
	public static int[][] byttRader(int[][] tab) {
	    int[] rad1 = tab[0];
	    int[] rad2 = tab[1];

	    tab[0] = tab[6];
	    tab[1] = tab[5];

	    tab[6] = rad1;
	    tab[5] = rad2;

	    return tab;
	}
	
	public static int finnAntall(int[][] tab, int tall) {
		
		int tallet = 0;
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (tall == tab[i][j]) {
					tallet++;
				}
			}
		}
		return tallet;
	}
	
	public static void nullstillOverGrense(int[][] tab, int grense) {
		
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (tab[i][j] >= grense) {
				    System.out.println("Setter " + tab[i][j] + " til 0");
				    tab[i][j] = 0;
				}
				}
			}
		}
	public static int diagonaleSum(int[][] tab) {
		
		int sum = 0;
		for (int i = 0; i < tab.length; i++) {
			if (i < tab[i].length) {
				sum += tab[i][i];			}
		}
		System.out.println("Den diagonale summen er av rad " + sum);
		return sum;
	}
	}






