package Uke37;

public class OppgaveG2c {

	public static int b(int x, int y) {

		while (x != y) {
			System.out.println("x = " + x + ", y = " + y);
			if (x > y) {
				x = x - y;
			} else {
				y = y - x;
			}
		}

		return x;
	}

	public static void main(String[] args) {
		System.out.println(b(28, 12));
		
		//x = 28, y = 12
		//x = 16, y = 12
		//x = 4, y = 12
		//x = 4, y = 8
		
	}

}
