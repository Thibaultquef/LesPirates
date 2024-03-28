package CaseSpeciale;

import jeu.Pirate;
import jeu.Plateau;
import jeu.JournalDeBord;
import java.util.Random;

import Enum.Effet;

public class CaseVictoire extends CaseSpeciale {
    
    public CaseVictoire(int numero) {
        super(numero, Effet.VICTOIRE); 
    }
    
    @Override
    public void appliquerEffet(Pirate pirate, Plateau plateau, Random random, JournalDeBord journal) {
        journal.afficherGagnant(pirate);
    }
    
    @Override
    public boolean estCaseVictoire() {
        return true;
    }
}
