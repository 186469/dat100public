package Uke39;

public class OppgaveB1 {

	public static void main(String[] args) {

		// Temperatur hele uke kl 12
			int[]temp = {3,6,7,4,5,7,9};
				
			double resultat = temp[1] + temp[2] + temp[0] + temp[3] + temp[4] + temp[5] + temp[6];
				
			System.out.printf("Gjennomsnittstemperaturen for denne uken er: %.2f\n", resultat / 7);

				
			int maks = finMax(temp);	
			System.out.println("Den høyeste temeraturen denne uken var: " + maks + " Celcius");
				
		}
	public static int finMax(int[]tabell) {
			int max = tabell[0];
			for (int i = 0; i < tabell.length; i++) {
				if (tabell[i] > max) {
					max = tabell[i];
				}
			}
			return max;
		}
	}
