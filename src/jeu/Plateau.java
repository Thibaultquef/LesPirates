package jeu;

import CaseSpeciale.Case;
import CaseSpeciale.CaseArme;
import CaseSpeciale.CaseRhum;
import CaseSpeciale.CaseVictoire;
import Enum.Arme;
import Enum.Effet;
import java.util.Random;

public class Plateau {
    private final int nbCases = 30;
    private Case[] caze;
    private Random random = new Random();
    Arme[] armes;

    public Plateau() { 
    	initialiserArmes();
        genererPlateau();
    }

    public void genererPlateau() {
        this.caze = new Case[nbCases];
        Effet[] effets = Effet.values();
        this.caze[nbCases - 1] = new CaseVictoire(nbCases);
        for (int i = 0; i < nbCases - 1; i++) { 
            Effet effetChoisi = effets[random.nextInt(effets.length)];
            switch (effetChoisi) {
                case ARME:
				
				this.caze[i] = new CaseArme(i + 1, armes[random.nextInt(armes.length)]);
                    break;
                case RHUM:
                    this.caze[i] = new CaseRhum(i + 1);
                    break;
                default:
                    this.caze[i] = new Case(i + 1); 
                    break;
                
            }

        }
        this.caze[nbCases-1] = new CaseVictoire(nbCases+1) ;
	}

    private void initialiserArmes() {
        armes = Arme.values();
    }
	public int getnbCases() {
		return nbCases;
	}

	public Case getCase(int numero) {
		return caze[numero];
	}
}
