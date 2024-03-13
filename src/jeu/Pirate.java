package jeu;

import Enum.Couleur;

public class Pirate {
	private int pointDeVie = 5;
	private String nom;
	private Couleur couleur;
	private int position;
	private Arme arme;
	
	public int getPV() {
		return pointDeVie;
	}
	
	public String getNom() {
		return nom;
	}
	
	public Couleur getCouleur() {
		return couleur;
	}
	
	public Arme getArme() {
		return arme;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void setPV() {
		this.pointDeVie = pointDeVie;
	}
	
	public void setArme() {
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
}
