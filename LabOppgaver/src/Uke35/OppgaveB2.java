package Uke35;

import javax.swing.JOptionPane;

public class OppgaveB2 {

	public static void main(String[] args) {

			String input = JOptionPane.showInputDialog("Skriv inn brukernavn");
			String input2 = JOptionPane.showInputDialog("Skriv inn passord");
			
			String Binput = JOptionPane.showInputDialog("Bekreft brukernavn");
			String Pinput = JOptionPane.showInputDialog("Bekreft Passord");
			
			if (Binput.equals(input) && Pinput.equals(input2)) {
				JOptionPane.showMessageDialog(null, "Du skrev inn brukernavn og passord.");
			}
			else {
				JOptionPane.showMessageDialog(null, "Du skrev inn feil brukernavn og passord.");
			}
			
	}

}
