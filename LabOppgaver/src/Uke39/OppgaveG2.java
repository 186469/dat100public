package Uke39;

public class OppgaveG2 {

	public static void main(String[] args) {

		double[][] obs = { { 1.4, 1.7, 1.9, 2.0 }, { 5.4, 7.8, 9.8, 7.9, 3.0 }, { -1.7, -1.7, -2.8 } };

		System.out.println("Før endring");
		skrivUt(obs);
		System.out.println();

		byttRader(obs, 0, 2);

		System.out.println("Etter endring");
		skrivUt(obs);

		double limit = 15.0;
		boolean result = finnes(obs, limit);
		System.out.println("Finnes det en verdi større enn: " +limit+ ": " +result);

	}

	public static void skrivUt(double[][] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			for (int j = 0; j < tabell[i].length; j++) {

				System.out.print(tabell[i][j] + " ");
			}
			System.out.println();
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

	public static void byttRader(double[][] tabell, int rad1, int rad2) {
		double[] temp = tabell[rad1];
		tabell[rad1] = tabell[rad2];
		tabell[rad2] = temp;
	}
}
