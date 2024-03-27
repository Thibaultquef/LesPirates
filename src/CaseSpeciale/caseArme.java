package CaseSpeciale;

import java.util.Random;
import Enum.Arme;
import Enum.Effet;
import jeu.JournalDeBord;
import jeu.Pirate;
import jeu.Plateau;

public class caseArme extends caseSpeciale {

	private Arme armeCase;

	public caseArme(int numero, Arme arme) {
		super(numero, Effet.ARME);
		this.armeCase = arme;
	}

	@Override
	public void appliquerEffet(Pirate pirate, Plateau plateau, Random random, JournalDeBord journal) {
		if (armeCase.getForce() > pirate.getArme().getForce()) {
			pirate.setArme(armeCase);
			journal.affichePiratePrendArme(pirate);
		} else {
			journal.affichePirateIgnoreArme(pirate);
		}
	}
}
