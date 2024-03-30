package CaseSpeciale;

import java.util.Random;

import Enum.Effet;
import jeu.JournalDeBord;
import jeu.Pirate;
import jeu.Plateau;

public class CaseFruit extends CaseSpeciale {

	public CaseFruit(int numero) {
		super(numero, Effet.FRUIT);
	}

	@Override
	public void appliquerEffet(Pirate pirate, Plateau plateau, Random random, JournalDeBord journal) {
        pirate.setDoubleDe(true);
        journal.afficherEffetFruit(pirate);	
	}
	
	
}
