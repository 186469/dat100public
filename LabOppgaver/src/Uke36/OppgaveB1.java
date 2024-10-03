package Uke36;

import javax.swing.JOptionPane;

public class OppgaveB1 {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Skriv inn en dato");
		String input2 = JOptionPane.showInputDialog("Skriv inn en månde");
		String input3 = JOptionPane.showInputDialog("Skriv inn et årstall");
		
		int dag = Integer.parseInt(input);
		int månde = Integer.parseInt(input2);
		int år = Integer.parseInt(input3);
		
		String resultat = dag + "/" + månde + "/" + år;
		JOptionPane.showMessageDialog(null, resultat);

	}

}
