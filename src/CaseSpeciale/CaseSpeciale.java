package CaseSpeciale;

import java.util.Random;
import Enum.Effet;
import jeu.JournalDeBord;
import jeu.Pirate;
import jeu.Plateau;

public abstract class CaseSpeciale extends Case {

	private Effet effet;

	protected CaseSpeciale(int numero, Effet effet) {
		super(numero);
		this.effet = effet;
	}

	public Effet getEffet() {
		return effet;
	}

	@Override
	public boolean estCaseSpeciale() {
		return true;
	}

	public abstract void appliquerEffet(Pirate pirate, Plateau plateau, Random random, JournalDeBord journal);
}
