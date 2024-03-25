package CaseSpeciale;

import java.util.Random;

import Enum.Effet;
import jeu.JournalDeBord;
import jeu.Pirate;
import jeu.Plateau;

public abstract class caseSpeciale extends Case {
	
	private Effet effet;
	
	
	public caseSpeciale(int numero, Effet effet) {
		super(numero);
        this.effet = effet;
	}

    @Override
    public boolean estCaseSpeciale() {
        return true;
    }

    public Effet getEffet() {
        return effet;
    }

    public abstract void appliquerEffet(Pirate pirate, Plateau plateau, Random random, JournalDeBord journal);
    
}