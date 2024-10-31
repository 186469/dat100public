package studentOppgave;

public class Student {

	private int studentnr;
	private int navn;
	
	public Student() {
		
	}
	public Student(int studentnr, String navn) {
		
	}
	public
	
	public void setStudent() {
		
	}
	
	@Override
	public String toString() {
		return "Student [studentnr =" + studentnr + ", navn =" + navn + "]";
	}
	
	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if(other == null || this.getClass() != other.getClass()) {
			return false;
		}
		Student s = (Student) other;
		return studentnr == s.getStudentnr();
		
	}
}

