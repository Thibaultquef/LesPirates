package CaseSpeciale;

import java.util.Random;

import Enum.Effet;
import jeu.JournalDeBord;
import jeu.Pirate;
import jeu.Plateau;

public class CaseRhum extends CaseSpeciale {

	public CaseRhum(int numero) {
		super(numero, Effet.RHUM);
	}

	@Override
	public void appliquerEffet(Pirate pirate, Plateau plateau, Random random, JournalDeBord journal) {
		//TODO appliquerEffet2
	}
}
