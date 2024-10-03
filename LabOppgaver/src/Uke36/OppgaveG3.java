package Uke36;

public class OppgaveG3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {
			
			switch (i) {
			case 1: 
				System.out.println(i+"A");
				break;
			case 2: 
				System.out.println(i+"B");
				break;
			case 3, 4, 5, 6, 7:
			case 8, 9:
				System.out.println(i+"C");
				break;
			default: 
				System.out.println(i+"D");
			}
		}
		
	}

}
