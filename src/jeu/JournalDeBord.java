package jeu;

import CaseSpeciale.Case;
import CaseSpeciale.CaseSpeciale;
import Enum.Arme;

public class JournalDeBord {

	public void afficherDebutDuel(Pirate pirate1, Pirate pirate2) {
		System.out.println("Le duel commence entre " + pirate1.getNom() + " et " + pirate2.getNom() + "!");
		System.out.println(pirate1.getNom() + " qui combat avec " + pirate1.getArme() + " VS " + pirate2.getNom() + " qui combat avec "
				+ pirate2.getArme());
	}

	public void afficherResultatDuel(Pirate attaquant, Pirate defenseur, int pvPerdus) {
		if (pvPerdus > 0) {
			
			System.out.println("L\'arme de " + attaquant.getNom() +" est plus puissante !");
			System.out.println(attaquant.getNom() + " attaque avec " + attaquant.getArme() +". " + defenseur.getNom() +" Perd " + pvPerdus
					+ " PV");
			System.out.println(
					"Il reste " + defenseur.getPV() + " à " + defenseur.getNom());
		} else {
			System.out.println("Les deux pirates " + attaquant.getNom() + " et " + defenseur.getNom()
					+ " sont à égalité, aucun PV perdu !");
		}
	}

	public void afficherFinDuel(Pirate attaquant, Pirate defenseur) {
		System.out.println("Le duel entre " + attaquant.getNom() + " et " + defenseur.getNom() + " est terminé.");
		if (attaquant.getPV() <= 0) {
			System.out.println(attaquant.getNom() + " est vaincu !");
		} else if (defenseur.getPV() <= 0) {
			System.out.println(defenseur.getNom() + " est vaincu !");
		} else {
			System.out.println("Les deux pirates sont encore en état de combattre !");
		}
	}

	public void afficherGagnantDuel(Pirate gagnant) {
		System.out.println(gagnant.getNom() + " est le dernier pirate en vie ! Il remporte la partie !");
	}
	
	public void afficherGagnant(Pirate gagnant) {
		System.out.println(gagnant.getNom() + " est sur la dernière case ! Il remporte la partie !");
	}

	public void aQuiTour(Pirate pirate) {
		System.out.println("C'est le tour de " + pirate.getNom() + ".");
	}

	public void lancerDe(Pirate pirate, int valeurDe) {
		System.out.println(pirate.getNom() + " lance le dé et obtient " + valeurDe + ".");
	}

	public void deplacement(Pirate pirate, int valeurDe, int nbCase) {
		System.out.println(pirate.getNom() + " avance de " + valeurDe + " cases.");
	}

	public void descCase(Pirate pirate, Case caseActuelle) {
		System.out.println(pirate.getNom() + " tombe sur la case numéro " + caseActuelle.getNumero() + ".");
	}

	public void gagnantPartie(Pirate pirate) {
		System.out.println(pirate.getNom() + " est le dernier pirate en vie ! Félicitations !");
	}

	public void afficheTrouveArme(Pirate pirate, Arme arme, int force) {
		System.out.println(pirate.getNom() + " trouve une arme: " + arme + " de force " + force);
	}

	public void affichePiratePrendArme(Pirate pirate, Arme arme) {
		 System.out.println(pirate.getNom() + " trouve et prend une nouvelle arme: " + arme.name() + " de force " + arme.getForce());
	}

	public void affichePirateIgnoreArme(Pirate pirate) {
		System.out.println(pirate.getNom() + " ignore l'arme trouvée car il en a déjà une meilleure.");
	}
    public void afficherReculeRhum(int lanceDe) {
        System.out.println("Vous avez trop bu, vous reculez de " + lanceDe + " cases.");
    }
    
    public void afficherDebutTour(Pirate pirate) {
        System.out.println("C'est le tour de " + pirate.getNom());
    }
    
    public void afficherLanceDe(int valeurDe) {
        System.out.println("Le dé a été lancé : " + valeurDe);
    }
    
    public void afficherDeplacement(Pirate pirate, int valeurDe) {
        System.out.println(pirate.getNom() + " se déplace de " + valeurDe + " cases.");
    }
    
    public void afficherFinDePartie(int tourActuel) {
        System.out.println("Fin de la partie après " + tourActuel + " tours.");
    }
    
    public void afficherInfoCase(Pirate pirate, Case caseActuelle) {
        if (caseActuelle instanceof CaseSpeciale) {
            CaseSpeciale caseSpeciale = (CaseSpeciale) caseActuelle;
            System.out.println(pirate.getNom() + " se trouve sur une case spéciale : " + caseSpeciale.getEffet());
        } else if (caseActuelle.estCaseVictoire()) {
            System.out.println(pirate.getNom() + " est sur la case de la victoire!");
        } else {
            System.out.println(pirate.getNom() + " est sur une case normale.");
        }
    }

    public void afficherEffetFruit(Pirate pirate) {
        System.out.println(pirate.getNom() + " mange un fruit du démon ! Son prochain lancer de dé sera doublé.");
    }

    public void afficherDoubleDe(Pirate pirate, int valeurDe) {
        System.out.println(pirate.getNom() + " bénéficie de l'effet du fruit du démon et lance un dé de valeur " + valeurDe + ".");
    }

}
