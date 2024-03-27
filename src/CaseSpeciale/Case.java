package CaseSpeciale;
import java.util.Random;

import Enum.Effet;
import jeu.Affichage;
import jeu.JournalDeBord;
import jeu.Pirate;
import jeu.Plateau;

public class Case {
	private Random random = new Random();
	private int numero;
	
    public Case(int numero) {
        this.numero = numero;
    }
    
	public int getNumero() {
		return numero;
	}
	
    public boolean estCaseSpeciale() {
        return false;
    }

	public void appliquerEffet(Pirate pirate, Plateau plateau, Random random2, JournalDeBord journal) {
		
	}
	
}
