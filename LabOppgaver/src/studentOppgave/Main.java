package studentOppgave;

public class Main {

	public static void main(String[] args) {

		Student s = new HVLstudent(1, "Ole", Campus.HAUGESUND);
		System.out.println(s.toString());
		
		Student s1 = new Student(2, "Arne");
		Student s2 = new Student(2, "Arne");

		if(s1.equals(s2)) {
			System.out.println("Objektene er like");
		} else {
			System.out.println("Objektene er ulike");
		}
	}

}
