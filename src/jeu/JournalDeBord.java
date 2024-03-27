package jeu;

import CaseSpeciale.Case;

public class JournalDeBord {

    public void afficherDebutDuel(Pirate pirate1, Pirate pirate2) {
        System.out.println("Le duel commence entre " + pirate1.getNom() + " et " + pirate2.getNom() + "!");
        System.out.println(pirate1.getNom() + " avec " + pirate1.getArme() + " VS " + pirate2.getNom() + " avec " + pirate2.getArme());
    }
    
    public void afficherResultatDuel(Pirate attaquant, Pirate defenseur, int pvPerdus) {
        if (pvPerdus > 0) {
            System.out.println(attaquant.getNom() + " attaque avec " + attaquant.getArme() + " et inflige " + pvPerdus + " dégâts à " + defenseur.getNom());
            System.out.println(defenseur.getNom() + " perd " + pvPerdus + " PV et il lui reste " + defenseur.getPV() + " PV");
        } else {
            System.out.println("Les deux pirates " + attaquant.getNom() + " et " + defenseur.getNom() + " sont à égalité, aucun PV perdu !");
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
    
    public void afficherGagnant(Pirate gagnant) {
        System.out.println(gagnant.getNom() + " est le dernier pirate en vie ! Il remporte la partie !");
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
}
