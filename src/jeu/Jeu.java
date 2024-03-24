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
	 
	public Pirate[] getListePirates(){
		return listePirates;
	}
	
	public Plateau getPlateau() {
		return plateau;
	}
	
	public void start() {
		
	}
	
	public Pirate[] remplissageListePirate(){
		
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
		int resultatDe = lanceDe();
		pirate.deplacerPirate(resultatDe);
		Case caseActuelle = plateau.getCase(pirate.getPosition()-1);
		caseActuelle.appliquerEffet(pirate, plateau, random, journal);
		
	}
	
	public void duel(Pirate pirate1, Pirate pirate2) {
        int distance = Math.abs(pirate1.getPosition() - pirate2.getPosition());
        if (distance <= 2) {
            Arme puissanceArmePirate1 = pirate1.getArme();
            Arme puissanceArmePirate2 = pirate2.getArme();
            
            if (puissanceArmePirate1.ordinal() > puissanceArmePirate2.ordinal()) {
                pirate2.setPv(pirate2.getPV() - 1);
                System.out.println(pirate1.getNom() + "a une force de" + puissanceArmePirate1);
                System.out.println(pirate2.getNom() + "a une force de" + puissanceArmePirate2);
                System.out.println(pirate1.getNom() + "gagne" + pirate2.getNom() + "perd 1 PV");
            } else if (puissanceArmePirate1.ordinal() < puissanceArmePirate2.ordinal()) {
                pirate1.setPv(pirate1.getPV() - 1);
                System.out.println(pirate1.getNom() + "a une force de" + puissanceArmePirate1);
                System.out.println(pirate2.getNom() + "a une force de" + puissanceArmePirate2);
                System.out.println("Le joueur 2 gagne, le joueur 1 perd 1 PV");
            } else {
                System.out.println(pirate1.getNom() + "a une force de" + puissanceArmePirate1);
                System.out.println(pirate2.getNom() + "a une force de" + puissanceArmePirate2);
                System.out.println("Aucun joueur ne gagne");
            }
        }
	}
	
	public void gagantDuel() {
		
	}
	

}

