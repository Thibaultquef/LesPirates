package jeu;

import java.util.Random;

import CaseSpeciale.Case;
import Enum.Arme;
import Enum.Couleur;
import Enum.Identite;

public class Jeu {
	private int nbJoueurs = 2;
	private Random random = new Random();
	private Plateau plateau;
	private Pirate[] listePirates;
	private JournalDeBord journal;

	public Pirate[] getListePirates() {
		return listePirates;
	}

	public Plateau getPlateau() {
		return plateau;
	}

	public void start() {

	}

	public Pirate[] remplissageListePirate() {

		Pirate[] listePirates = new Pirate[nbJoueurs];
		Couleur[] couleurs = Couleur.values();
		Identite[] identites = Identite.values();

		for (int i = 0; i < nbJoueurs; i++) {
			Pirate pirate = new Pirate();

			int idxCouleur = random.nextInt(couleurs.length);
			int idxIdentite = random.nextInt(identites.length);

			pirate.setNom(identites[idxIdentite].toString());
			pirate.setCouleur(couleurs[idxCouleur]);
			pirate.setArme(Arme.POINGS);

			listePirates[i] = pirate;
		}

		return listePirates;

	}

	public int lanceDe() {
		return (random.nextInt(7));
	}

	public void tourPirate(Pirate pirate) {
		int valeurDe = lanceDe();

		journal.aQuiTour(pirate);
		journal.lancerDe(pirate, valeurDe);

		pirate.deplacerPirate(valeurDe);
		journal.deplacement(pirate, valeurDe, plateau.getnbCases());

		Case caseActuelle = plateau.getCase(pirate.getPosition());
		journal.descCase(pirate, caseActuelle);

		caseActuelle.appliquerEffet(pirate, plateau, random, journal);
		if (gagnantDuel(pirate)) {
			journal.gagnantPartie(pirate);
		}
	}

	public void duel(Pirate pirate1, Pirate pirate2) {
		int distance = Math.abs(pirate1.getPosition() - pirate2.getPosition());
		if (distance <= 2) {
			Arme puissanceArmePirate1 = pirate1.getArme();
			Arme puissanceArmePirate2 = pirate2.getArme();

			journal.afficherDebutDuel(pirate1, pirate2);

			if (puissanceArmePirate1.ordinal() > puissanceArmePirate2.ordinal()) {
				pirate2.setPv(pirate2.getPV() - 1);
				journal.afficherResultatDuel(pirate1, pirate2, 1);
			} else if (puissanceArmePirate1.ordinal() < puissanceArmePirate2.ordinal()) {
				pirate1.setPv(pirate1.getPV() - 1);
				journal.afficherResultatDuel(pirate2, pirate1, 1);
			} else {
				journal.afficherResultatDuel(pirate1, pirate2, 0);
			}

			journal.afficherFinDuel(pirate1, pirate2);
		}
	}

	public boolean gagnantDuel(Pirate pirate) {
		for (Pirate p : listePirates) {
			if (p != pirate && p.getPV() > 0) {
				return false;
			}
		}
		journal.afficherGagnant(pirate);
		return true;
	}
}
