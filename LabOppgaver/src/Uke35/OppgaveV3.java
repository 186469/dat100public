package Uke35;

import javax.swing.JOptionPane;

public class OppgaveV3 {

	public static void main(String[] args) {

		String a = JOptionPane.showInputDialog("Skriv inn et heltall");
		String b = JOptionPane.showInputDialog("Skriv inn et heltall");
		String c = JOptionPane.showInputDialog("Skriv inn et heltall");
		
		Integer en = Integer.parseInt(a);
		Integer to = Integer.parseInt(b);
		Integer tre = Integer.parseInt(c);

		int størst = Math.max(en, Math.max(to, tre));
		int minst = Math.min(en, Math.min(to, tre));
		int midten = en + to + tre - størst - minst;
		
		System.out.println(størst);
		System.out.println(midten);
		System.out.println(minst);
		
		
		
	}

}
