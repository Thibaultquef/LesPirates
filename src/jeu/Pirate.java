package jeu;

import Enum.Arme;
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
	
	public void setNom(String nom) {
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
}
