package jeu;
import java.util.Random;

import Enum.Arme;
import Enum.Couleur;
import Enum.Identite;

public class Jeu {
	private int nbJoueurs = 2;
	private Random random = new Random();
	private Plateau plateau;
	private Pirate[] listePirates;
	 
	public Pirate[] getListePirates(){
		return listePirates;
	}
	
	public Plateau getPlateau() {
		return plateau;
	}
	
	public void start() {
		
	}
	
	public Pirate[] remplissageListePirate(){
		Random random = new Random();
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
		return (int) (random.nextInt(7));
	}
	
	public void tourPirate(Pirate pirate) {
		
	}
	
	public void duel() {
		
	}
	
	public void gagantDuel() {

	}
	

}

