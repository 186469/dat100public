package zoomOppgaver;

public class Main {

	public static void main(String[] args) { // koden brukes til (bok) og

//		Brukes til (bok og time2609)
		Bok b = new Bok("java..", "Lars", 200.50, 200);
//		b.skrivUt();

		// Brukes til bok
//		System.out.println(b.getTittel());	
//		b.setTittel("Java for amatører");
//		b.skrivUt();

//		Bok b2 = new Bok();
//		b2.skrivUt();

		// Brukes til time2609
		Bok[] bTab = new Bok[3];

		bTab[0] = b;
		bTab[1] = new Bok();
		bTab[2] = new Bok("Matematikk ...", "Kari", 300, 250);

//		for(Bok e : bTab) {
//			//System.out.println(e.getTittel());
//			e.skrivUt();

//		skrivBokTabell(bTab);
		visBilligereEnn(bTab, 240);
	}
	
	

	public static void skrivBokTabell(Bok[] tab) {
		for (Bok e : tab) {
			e.skrivUt();
		}
	}

	public static void visBilligereEnn(Bok[] tab, double grense) {
		for (Bok e : tab) {
			if (e.getPris() < grense) {
				System.out.println();
				e.skrivUt();
			}
		}
	}
	

}
