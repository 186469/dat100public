package Uke37;

import javax.swing.JOptionPane;

public class OppgaveO3 {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Skriv inn et heltall");
		Integer tall = Integer.parseInt(input);
		
		int n = tall;
		int result = 1;
		
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		System.out.println(result);
		
		
	}

}
