package Uke39;

public class OppgaveB2 {

	public static void main(String[] args) {

		// False = opptatt   |   true = ledig
		
		boolean[][] aud = {
		        {false, true, true, false},  
		        {true, true, true, true},   
		        {false, true, true, false}, 
		        {true, false, true, true},   
		        {false, true, true, true}    
		    };


		
		int ledig = seterLedig(aud);
		System.out.println("Antall ledige seter er: " + ledig);
		
		double prosent = prosentAndel(aud);
		System.out.println("Prosent antall opptatte seter er: " + prosent + "%");
		
		førsteLedige(aud);
		
		førsteLedigeBakvendt(aud);
		
		boolean finnes = finnesLedigeSeter(aud);
		System.out.println("Finnes det et sete? " + finnes);
		
		boolean smittevernOk = sjekkSmittevern(aud);
	    if (smittevernOk) {
	        System.out.println("Auditoriet er godkjent for smittevern.");
	    } else {
	        System.out.println("Auditoriet er ikke godkjent for smittevern.");
	    }
	}
		
		
	
	
	public static int seterLedig(boolean[][] seter) {
		
		int ledig = 0;
		for (int i = 0; i < seter.length; i++) {
			for (int j = 0; j < seter[i].length; j++) {
				if (seter[i][j] == true) {
					ledig++;
				}
			}
		}
		return ledig;
	}
	
	public static double prosentAndel(boolean[][] seter) {
		
		int opptatt = 0;
		int totalt = 0;
		
		for (int i = 0; i < seter.length; i++) {
			for (int j = 0; j < seter[i].length; j++) {
				totalt++;
				if (seter[i][j] == false) {
					opptatt++;
				}
			}
			
		}
		return ((double)opptatt / totalt) * 100;
		
	}
	public static void førsteLedige(boolean[][] seter) {
		
		for (int i = 0; i < seter.length; i++) {
			for (int j = 0; j < seter[i].length; j++) {
				if(seter[i][j] == true) {
					System.out.println("Første sete som er ledig er på rad " + i + ", og sete " + j);
					return;
				}
			}
		}
		System.out.println("Det er ikke et sete som er ledig");
		
	}
	public static void førsteLedigeBakvendt(boolean[][] seter) {
		for (int i = seter.length - 1; i >= 0 ; i--) {
			for (int j = seter[i].length - 1; j >= 0; j--) {
				if (seter[i][j] == true) {
					System.out.println("Første sete som er ledig bakfra er på rad " + i + ", og sete " + j);
					return;
				}
			}
		}
	}
	public static boolean finnesLedigeSeter(boolean[][] seter) {
		
		for (boolean[] rad : seter) {
			for (boolean sete : rad) {
				if (sete) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean sjekkSmittevern(boolean[][] seter) {
	   
	    for (int i = 0; i < seter.length; i++) {
	        int antallPersoner = 0;  
	        int ledigePlasser = 0;  
	        
	        for (int j = 0; j < seter[i].length; j++) {
	            if (seter[i][j] == false) {  
	                if (antallPersoner > 0 && ledigePlasser < 2) {
	                   
	                    return false;  
	                }
	                antallPersoner++;  
	                ledigePlasser = 0; 
	            } else {
	               
	                ledigePlasser++;
	            }
	        }
	    }
	    return true;  
	}


}




