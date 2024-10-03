package Uke37;

import javax.swing.JOptionPane;

public class OppgaveG3 {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Skriv inn et lavt tall");
		String input2 = JOptionPane.showInputDialog("Skriv inn et høyere tall");
		
		int lavt = Integer.parseInt(input);
		int høyt = Integer.parseInt(input2);
		
		StringBuilder oddetall = new StringBuilder("Oddetall mellom " +lavt + " og " + høyt + " er: ");
		
		if (lavt % 2 == 0) {
			lavt = lavt + 1;
		}
		
		for (int i = lavt; i <= høyt; i+=2) {
			oddetall.append(i).append(", ");
			
		}
		JOptionPane.showMessageDialog(null, oddetall);
		
	}

}
