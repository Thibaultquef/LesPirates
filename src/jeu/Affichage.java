package jeu;

import CaseSpeciale.Case;

public interface Affichage {
	public void contexte(Pirate listePirate);

	public void aQuiTour(Pirate pirate);

	public void lancerDe(Pirate pirate, int de);

	public void deplacement(Pirate pirate, int de, int nbCase);

	public void descCase(Pirate pirate, Case caseActuelle);

	public void appliquerEffetNeutre(Pirate pirate);

	public void appliquerEffetRhum(Pirate pirate);

	public void appliquerEffetArme(Case caseActuelle, Pirate pirate);

	public void debutDuel(Pirate pirateI, Pirate pirateJ, int deI, int deJ);

	public void finDuel(Pirate gagnant, Pirate perdant, int degat);

	public void gagantBarque(Pirate pirate);

	public void gagantParDuel(Pirate pirate);

	public void tousMort();

	public void aPeri(Pirate pirate);
}
