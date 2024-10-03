package Uke36;

import javax.swing.JOptionPane;

public class OppgaveG4 {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Skriv inn bredde");
		String input2 = JOptionPane.showInputDialog("Skriv inn lengde");
		
		int bredde = Integer.parseInt(input);
		int lengde = Integer.parseInt(input2);
		
		String resultat = "Arealet er " + bredde * lengde + "cm^2";
		
		JOptionPane.showMessageDialog(null, resultat);
		
	}

}
