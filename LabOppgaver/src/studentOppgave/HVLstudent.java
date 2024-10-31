package studentOppgave;

public class HVLstudent extends Student {

	private Campus campus;
	
	public HVLStudent(int nr, String navn, Campus canpus) {
		super(nr, navn);
		this.campus = campus;
	}
	
	@Override
	public String toString() {
		return super.toString() + "HVL Student[Campus = " + campus + "]";
	}
	
}
