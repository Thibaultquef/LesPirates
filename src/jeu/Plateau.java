package jeu;
import java.util.Random;

public class Plateau {
	private final int nbCases = 30;
	private Case[] listeCases;
	

	public int getnbCases(){
		return nbCases;
	}
	
	public Case getCase() {
		
		return null;
	}
	
	private void initialiserCase() {
		listeCases[0] = new CaseNeutre();
	}
}
