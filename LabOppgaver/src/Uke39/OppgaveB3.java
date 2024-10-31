package Uke39;

import javax.swing.JOptionPane;
import easygraphics.EasyGraphics;

public class OppgaveB3 extends EasyGraphics {

    // Terreng-tabellen
    private static int[][] terreng = {
        { 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 },
        { 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 },
        { 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 }
    };

    public static void main(String[] args) {
        launch(args); // Start EasyGraphics-applikasjonen
    }

    public void run() {
        // Leser inn havnivå fra brukeren via dialogboks
        int havNivaa = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn havnivå:"));
        visualiser(havNivaa); // Kaller visualiseringsmetoden med havnivået
    }

    public void visualiser(int havNivaa) {
        int radius = 20;  // Radiusen på sirklene
        int xOffset = 50; // Startposisjon for tegning på x-aksen
        int yOffset = 50; // Startposisjon for tegning på y-aksen

        makeWindow("Visualisering av terreng", 400, 300); // Oppretter et vindu for grafikken

        // Ytre løkke: Går gjennom radene i terrenget
        for (int i = 0; i < terreng.length; i++) {
            // Indre løkke: Går gjennom verdiene i raden
            for (int j = 0; j < terreng[i].length; j++) {
                int høyde = terreng[i][j];
                int x = xOffset + j * (radius + 10); // Beregner x-posisjon
                int y = yOffset + i * (radius + 10); // Beregner y-posisjon
                
                // Bestemmer fargen basert på høyden i forhold til havnivået
                if (høyde < havNivaa) {
                    setColor(0, 0, 255);  // Blå for områder under havet
                } else if (høyde < havNivaa + 1) {
                    setColor(255, 165, 0); // Oransje for mindre enn 1 meter over havet
                } else {
                    setColor(222, 184, 135); // Lysebrun for mer enn 1 meter over havet
                }
                
                // Tegner sirkelen på riktig posisjon
                fillCircle(x, y, radius);
            }
        }
    }
}
