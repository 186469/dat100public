package zoomOppgaver;

public class time2609 {

	public static void main(String[] args) {

		 double[][] obs = {
 				{1.4,1.7,1.9,2.0},
 				{5.4,7.8,9.8,7.9,3.0},
 				{-1.7,-1.7,-2.8}
 		};
		// skrivUt(obs);
//		 System.out.println(obs[0].length);
//		 System.out.println(obs[1].length);
//		 System.out.println(obs[2].length);
		 
		int limit = 8;
		boolean resultat = finnes(obs, limit);
		System.out.println(resultat);
		
	}
	public static void skrivUt(double[][] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			for (int j = 0; j < tabell[i].length; j++) {
				System.out.print(tabell[i][j] + ", ");
			}
		}
	}
	public static boolean finnes(double[][] obs, double limit) {
		
		for (int i = 0; i < obs.length; i++) {
			for (int j = 0; j < obs[i].length; j++) {
				if (obs[i][j] > limit) {
				return true;
				}
		}
		}
		return false;
	}
}

