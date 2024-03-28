package Test;

import jeu.Jeu;
import jeu.Pirate;
import Enum.Arme;
import Enum.Couleur;
import Enum.Identite;

public class TestDuel {
	public static void main(String[] args) {
		Jeu jeu = new Jeu();
		Pirate pirate1 = new Pirate();
		pirate1.setNom(Identite.LUFFY);
		pirate1.setCouleur(Couleur.NOIR);
		pirate1.setArme(Arme.SABRE);
		pirate1.setPosition(5);
		pirate1.setPv(5);

		Pirate pirate2 = new Pirate();
		pirate2.setNom(Identite.SABO);
		pirate2.setCouleur(Couleur.ROUGE);
		pirate2.setArme(Arme.MOUSQUET);
		pirate2.setPosition(6);
		pirate2.setPv(5);

		jeu.duel(pirate1, pirate2);
	}
}
