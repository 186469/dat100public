package zoomOppgaver;

public class time2410 {

	private Bok[] boker;
	private int antall;
	
//	public Boksamling(int startStorrelse) {
		
//		new Bok[startStorrelse];
//		antall = 0;	
//	}
	
	public int getAntall() {
		return antall;
	}
//	public booleana erTom() {
//		return (antall == 0);
//		
//	}

//	private int finnPos(int nr) {
//		boolean funnet = false;
//		int pos = 0;
		
//		while (pos < antall && !funnet) {
//			if (boker[pos].getNummer() == nr) {
//				funnet = true;
//			}
//			else {
//				pos++;
//			}
//		}
//	}
//	public Bok finn(int nr) {
//		int p = finnPos(nr);
//		
//		if (p >= 0) {
//			return boker[p];
//		}
//		else {
//			return null;
//		}
//	}
	
	private void utvid() {
		Bok[] nyTab = new Bok[2 * boker.length];
		for (int i = 0; i < antall; i++) {
			nyTab[i] = boker[i];
		}
		boker = nyTab;
	}
	public void leggTil(Bok bok) {
		if (antall == boker.length) {
			utvid();
		}
		boker[antall] = bok;
		antall++;
	}
}
//	public void leggTil_2(Bok bok) throws Exception {
//		if (antall = boker.length) {
//			throw new Exception("samlingen er full");
//		}
//		if (bok == 0) {
//			throw new NullPonterException("Nullreferanse bok");
//			
//		}
//		boker[antall] = bok;
//		antall++;
//	}
//}


