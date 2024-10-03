package Uke35;

import javax.swing.JOptionPane;

public class OppgaveB3 {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Skriv inn antall sekunder");
		Integer sekunder = Integer.parseInt(input);
		
		int timer = sekunder / 3600;
		int minutter = (sekunder % 3600) / 60;
		int sek = sekunder % 60;
		
		String resultat = sekunder + " sekunder tilsvarer: " +timer+ " time, " +minutter+ " minutt, " +sek+ " sekunder.";
		JOptionPane.showMessageDialog(null, resultat);
		
	}

}
