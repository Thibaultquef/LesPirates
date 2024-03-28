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
        int lanceDe = random.nextInt(6) + 1;
        int nouvellePosition = Math.max(pirate.getPosition() - lanceDe, 1);
        pirate.setPosition(nouvellePosition);
        journal.afficherReculeRhum(lanceDe);
	}
}
