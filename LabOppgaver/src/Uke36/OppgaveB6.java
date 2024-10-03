package Uke36;

import javax.swing.JOptionPane;

public class OppgaveB6 {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Skriv inn bruttolønn");
		int inntekt = Integer.parseInt(input);
		int skatt = 0;
		
		if (inntekt > 1350000) {
			skatt += (inntekt - 1350000) * 0.176;
			inntekt = 1350000;
		}
		 if (inntekt > 937900) {
			skatt += (inntekt - 937900) * 0.166;
			inntekt = 937900;
		}
		 if (inntekt > 670000) {
			skatt += (inntekt - 670000) * 0.136;
			inntekt = 670000;
		}
		 if (inntekt > 292850) {
			skatt += (inntekt - 292850) * 0.04;
			inntekt = 292850;
		}
		 if (inntekt > 208050) {
			skatt += (inntekt - 208050) * 0.017;
			inntekt = 208050;
		}
		System.out.println("Du betaler: " +skatt+ " kr i skatt");
		
	}

}
