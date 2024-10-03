package Uke36;

import javax.swing.JOptionPane;

public class OppgaveB4 {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Hva er prisen");
		String input2 = JOptionPane.showInputDialog("Hvor mye skal du betale");
		
		int pris = Integer.parseInt(input);
		int betale = Integer.parseInt(input2);
		
		int veksel = betale - pris;
		
		int tier = veksel / 10;
		int enere = veksel % 10;
		
		String resusltat = "Antall tiere: " +tier+ "\nAntall enere: " +enere;
		System.out.println(resusltat);
		
		
	}

}
