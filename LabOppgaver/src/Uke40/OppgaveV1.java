package Uke40;

public class OppgaveV1 {

	public static void main(String[] args) {

		int[][] tabell = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
		 
		skrivUt(tabell);
		
		System.out.println();
		
		int sum = sum(tabell);
		System.out.println("Summen av tabellen er " + sum);
	}
	
	public static void skrivUt(int[][] tabell) {
		
		int antallRader = tabell.length;
		int antallKolonner = tabell[0].length;
		
		for (int i = 0; i < antallRader * antallKolonner; i++) {
			int rad = i / antallKolonner;
			int kolonne = i % antallKolonner;
			
			System.out.print(tabell[rad][kolonne] + " ");
			
			if (kolonne == antallKolonner - 1) {
				System.out.println();
			}
		}
		
	}
	public static int sum(int[][]tabell) {
		
		int sum = 0;
		int antallRader = tabell.length;
		int antallKolonner = tabell[0].length;
		
		for (int i = 0; i < antallRader * antallKolonner; i++) {
			int rad = i / antallKolonner;
			int kolonne = i % antallKolonner;
			
			sum = sum + tabell[rad][kolonne];
			
		}
		return sum;
	}

}




