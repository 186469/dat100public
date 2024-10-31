package Uke39;

import java.util.Arrays;

public class OppgaveB1 {

	public static void main(String[] args) {

		// Temperatur hele uke kl 12
		int[]temp = {3,6,7,4,5,7,9};
				
		// Gjennomnsitts temperaturen
		double gjennomsnitt = gjen(temp);
		String resultat = String.format("%.2f", gjennomsnitt);
		System.out.println("Gjennomsnittstemperaturen er " + resultat);
			
		System.out.println();
			
		// Høyeste temperaturen
		int maksTemp = finMax(temp);
		System.out.println("Den høyeste temperaturen er " + maksTemp);
			
		}
		
	public static double gjen(int[] tab) {
			
		double sum = 0;
		for (int i = 0; i < tab.length; i++) {
			sum = Arrays.stream(tab).sum(); 
//			sum = sum + tab[i];
		}
		return sum / tab.length;		
	}
	
	public static int finMax(int[] tab) {
			
		int start = tab[0];
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > start) {
				start = tab[i];
				}
			}
		return start;
		}
		}			
