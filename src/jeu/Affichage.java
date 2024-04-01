package jeu;

import CaseSpeciale.Case;
import Enum.Arme;

public interface Affichage {
	public void afficherDebutDuel(Pirate pirate1, Pirate pirate2);
	
	public void afficherResultatDuel(Pirate attaquant, Pirate defenseur, int pvPerdus);
	
	public void afficherFinDuel(Pirate attaquant, Pirate defenseur);
	
	public void afficherGagnantDuel(Pirate gagnant);
	
	public void afficherGagnant(Pirate gagnant);
	
	public void aQuiTour(Pirate pirate);
	
	public void lancerDe(Pirate pirate, int valeurDe);
	
	public void deplacement(Pirate pirate, int valeurDe, int nbCase);
	
	public void descCase(Pirate pirate, Case caseActuelle);
	
	public void gagnantPartie(Pirate pirate);
	
	public void afficheTrouveArme(Pirate pirate, Arme arme, int force);
	
	public void affichePiratePrendArme(Pirate pirate, Arme arme);
	
	public void affichePirateIgnoreArme(Pirate pirate);
	
	public void afficherReculeRhum(int lanceDe);
	
	public void afficherDebutTour(Pirate pirate);
	
	public void afficherLanceDe(int valeurDe);
	
	public void afficherDeplacement(Pirate pirate, int valeurDe);
	
	public void afficherFinDePartie(int tourActuel);
	
	public void afficherInfoCase(Pirate pirate, Case caseActuelle);
	
	public void afficherEffetFruit(Pirate pirate);
	
	public void afficherDoubleDe(Pirate pirate, int valeurDe);
	
}
