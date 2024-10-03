package Uke36;

import javax.swing.JOptionPane;

public class OppgaveG5 {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Skriv inn et heltall");
		String input2 = JOptionPane.showInputDialog("Skriv inn et heltall");
		String input3 = JOptionPane.showInputDialog("Skriv inn et heltall");
		String input4 = JOptionPane.showInputDialog("Skriv inn et heltall");
		
		Integer tall = Integer.parseInt(input);
		Integer tall2 = Integer.parseInt(input2);
		Integer tall3 = Integer.parseInt(input3);
		Integer tall4 = Integer.parseInt(input4);
		
		int minst = Math.min(tall, Math.min(tall2, Math.min(tall3, tall4)));
		
		JOptionPane.showMessageDialog(null,"Det minste tallet er: " + minst);
		

	}

}
