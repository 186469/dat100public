package zoomOppgaver;

public class Bok {

	private String tittel;
	private String forfatter;
	private double pris;
	private int antallSider;

	public String getTittel() {
		return tittel;

	}

	public String getForfatter() {
		return forfatter;

	}

	public double getPris() {
		return pris;

	}

	public int getAntallSider() {
		return antallSider;

	}

	public Bok() {

		tittel = "Nada";
		forfatter = "Ukjent";
	}

	public void setTittel(String nyTittel) {
		tittel = nyTittel;
	}

	public Bok(String tittel, String f, double p, int as) {
		this.tittel = tittel;
		forfatter = f;
		pris = p;
		antallSider = as;
		
	}

	public void skrivUt() {
		System.out.println("Tittel: " + tittel);
		System.out.println("Forfatter: " + forfatter);
		System.out.println("Pris: " + pris);
		System.out.println("Antall sider: " + antallSider);

	}
	 

}
