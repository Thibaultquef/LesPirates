package jeu;

import Enum.Arme;
import Enum.Couleur;
import Enum.Identite;

public class Pirate {
	private int pointDeVie = 5;
	private Identite nom;
	private Couleur couleur;
	private int position = 1;
	private Arme arme = Arme.POINGS;
    private boolean doubleDe = false;

	
	public int getPV() {
		return pointDeVie;
	}
	
	public Identite getNom() {
		return nom;
	}
	
	public void setNom(Identite nom) {
		this.nom = nom;
	}
	
	
	public Couleur getCouleur() {
		return couleur;
	}
	
	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}
	
	public Arme getArme() {
		return arme;
	}
	
	
	public int getPosition() {
		return position;
	}
	
	public void setPv(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}
	
	public void setArme(Arme arme) {
		this.arme = arme;
	}
	
	public void deplacerPirate(int valeurDe) {
		int positionActuelle = getPosition();
		int nouvellePosition = positionActuelle + valeurDe;
		this.position = nouvellePosition;
	}
	
	public int calculerDegat(int difference) {
		return difference;
	}
	
	public int infligerDegat(int difference) {
		return difference;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
    public boolean isDoubleDe() {
        return doubleDe;
    }

    public void setDoubleDe(boolean doubleDe) {
        this.doubleDe = doubleDe;
    }
}
