package Uke39;
import javax.swing.JOptionPane;

public class OppgaveG3 {

	public static void main(String[] args) {

			int hoyde = lesInnTall("Høyde: ");
			int bredde = lesInnTall("Bredde: ");

			int a = areal(bredde,hoyde);

			JOptionPane.showMessageDialog(null,"Areal: " + a);
		}

		private static int areal(int bredde, int hoyde) {

			int flateareal = bredde * hoyde;

			return flateareal;
		}
		
		private static int lesInnTall(String message) {
			
			int tall;
			do {
				String input = JOptionPane.showInputDialog(message);
				tall = Integer.parseInt(input);
				if (tall <= 0) {
					System.out.println("Tallet må være positivt.");
			}
			}
			while(tall <= 0);
				return tall;
			}
		
	}


