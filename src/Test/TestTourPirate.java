package Test;

import jeu.Jeu;
import jeu.Pirate;


public class TestTourPirate {
    public static void main(String[] args) {
        Jeu jeu = new Jeu(); 
        jeu.remplissageListePirate();
        
        Pirate[] pirates = jeu.getListePirates();

        System.out.println("Avant le tour des pirates:");
        for (Pirate pirate : pirates) {
            System.out.println("Nom: " + pirate.getNom() + ", Position: " + pirate.getPosition() + ", PV: " + pirate.getPV() + ", Arme: " + pirate.getArme());
        }

        for (Pirate pirate : pirates) {
            jeu.tourPirate(pirate);
        }

        System.out.println("\nAprès le tour des pirates:");
        for (Pirate pirate : pirates) {
            System.out.println("Nom: " + pirate.getNom() + ", Position: " + pirate.getPosition() + ", PV: " + pirate.getPV() + ", Arme: " + pirate.getArme());
        }
    }
}
