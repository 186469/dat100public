package Uke35;

import java.util.Scanner;

public class OppgaveV1 {

	public static void main(String[] args) {

			String brukernavn = null;
			String passord = null;

			Scanner input = new Scanner(System.in);

			String funksjonTxt = "Velg funksjon\n a) - opprette konto\n b) - endre passord\n c) - slette konto\n d) - login";
			String a = "opprette konto";
			String b = "endre passord";
			String c = "slette konto";
			String d = "login";
			
			
			System.out.println(funksjonTxt);
			System.out.print(">");

			String valgTxt = input.nextLine();
			
			if (valgTxt.equals("a")) {
				System.out.println("Opprett brukenavn");
				brukernavn = input.nextLine();
				System.out.println("Skriv inn et passord");
				passord = input.nextLine();
			}
			else if (valgTxt.equals("b")) {
				System.out.println("Gammelt passord");
				passord = input.nextLine();
				System.out.println("Endre passordet");
				passord = input.nextLine();
			}
			else if (valgTxt.equals("c")) {
				System.out.println("Brukernavn");
				brukernavn = input.nextLine();
				System.out.println("Passord");
				passord = input.nextLine();
			}
			else if (valgTxt.equals("d")) {
				System.out.println("Brukernavn");
				brukernavn = input.nextLine();
				System.out.println("Passord");
				passord = input.nextLine();
			}
			else {
				System.out.println("Ugyldig valg");
			}
			
			System.out.println(brukernavn);
			System.out.println(passord);
			input.close();
		}
}

