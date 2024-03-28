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

	public Jeu() {
		this.journal = new JournalDeBord();
		this.plateau = new Plateau();
		this.listePirates = new Pirate[0];
		this.listePirates = new Pirate[2];
		remplissageListePirate();
	}

	public void initialiserPlateau() {
		this.plateau = new Plateau();
	}

	public Plateau getPlateau() {
		return plateau;
	}

	public void start() {
		// TODO a faire
	}

	public void remplissageListePirate() {
		for (int i = 0; i < listePirates.length; i++) {
			Pirate pirate = new Pirate();

			Identite identite = Identite.values()[random.nextInt(Identite.values().length)];
			Couleur couleur = Couleur.values()[random.nextInt(Couleur.values().length)];
			Arme arme = Arme.values()[random.nextInt(Arme.values().length)];

			pirate.setNom(identite);
			pirate.setCouleur(couleur);
			pirate.setArme(arme);
			pirate.setPosition(1);
			pirate.setPv(5);

			listePirates[i] = pirate;
		}
	}

	public Pirate[] getListePirates() {
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
		caseActuelle.appliquerEffet(pirate, plateau, random, journal);
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
