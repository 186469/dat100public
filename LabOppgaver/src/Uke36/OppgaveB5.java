package Uke36;

import javax.swing.JOptionPane;

public class OppgaveB5 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i ++) {
		
		String input = JOptionPane.showInputDialog("Skriv inn en poengsum");
		int poeng = Integer.parseInt(input);
		
		if (poeng > 100 || poeng < 0) {
			System.out.println("Ugyldig poengsum, skriv inn en poengsum mellom 0 - 100");
			i = i - 1;
		}
		else {
			if (poeng >= 90) {
				System.out.println("Elev nummer" +i+ " fikk karakteren A");
			}
			else if ( poeng >= 80) {
				System.out.println("Elev nummer " +i+ " fikk karakteren B");
			}
			else if (poeng >= 60) {
				System.out.println("Elev nummer " +i+ " fikk karakteren C");
			}
			else if (poeng >= 50) {
				System.out.println("Elev nummer " +i+ " fikk karakteren D");
			}
			else if (poeng >= 40) {
				System.out.println("Elev nummer " +i+ " fikk karakteren E");
			}
			else {
				System.out.println("Elev nummer " +i+ " fikk karakteren F");
			}
		}
		}
	}

}
