package jeu;

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
	
	public void appliquerEffet(int position) {
		
	}
}
