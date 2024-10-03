package zoomOppgaver;

public class Liste1809 {

    public static void main(String[] args) {

        int[][] data = { 
            {1, 2, 0}, 
            {3, 4, 0}, 
            {5, 6, 0}, 
            {0, 0, 0}
        };

        // Beregn summen av rader og kolonner
        beregnSum(data);

        // Skriv ut matrisen med beregnede summer
        skrivUt(data);
    }

    // Metode for å beregne sum av rader og kolonner
    public static void beregnSum(int[][] data) {

        // Beregn sum av elementene i hver rad og sett i siste kolonne
        for (int r = 0; r < data.length - 1; r++) {
            int sum = 0;
            for (int k = 0; k < data[r].length - 1; k++) {
                sum += data[r][k];  // Legger til hvert element i raden (unntatt siste kolonne)
            }
            data[r][data[r].length - 1] = sum;  // Sett summen i siste kolonne
        }

        // Beregn sum av elementene i hver kolonne og sett i siste rad
        int radlengde = data[0].length;
        int sisteradpos = data.length - 1;

        for (int k = 0; k < radlengde; k++) {
            int sum = 0;
            for (int r = 0; r < sisteradpos; r++) {
                sum += data[r][k];  // Legger til hvert element i kolonnen (unntatt siste rad)
            }
            data[sisteradpos][k] = sum;  // Sett summen i siste rad
        }
    }

    // Metode for å skrive ut matrisen
    public static void skrivUt(int[][] data) {
        for (int r = 0; r < data.length; r++) {
            for (int k = 0; k < data[r].length; k++) {
                System.out.print(data[r][k] + " ");
            }
            System.out.println();  // Ny linje etter hver rad
        }
    }
}

