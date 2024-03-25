package CaseSpeciale;

import java.util.Random;

import Enum.Effet;
import jeu.JournalDeBord;
import jeu.Pirate;
import jeu.Plateau;

public class caseArme extends caseSpeciale {

	public caseArme(int numero, Effet effet) {
		super(numero, effet);
	}
	
	@Override
    public void appliquerEffet(Pirate pirate, Plateau plateau, Random random, JournalDeBord journal) {
		
	}

}
