package jeu;

import CaseSpeciale.Case;

public class Plateau {
	private final int nbCases = 30;
	private Case[] caze;

	public int getnbCases() {
		return nbCases;
	}

	public Case getCase(int numero) {
		return caze[numero];
	}
}
