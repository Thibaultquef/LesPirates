package jeu;
import java.util.Random;

public class Jeu {
	private int nbJoueurs = 2;
	private Random random = new Random();
	private Plateau plateau;
	private Pirate[] listePirates;
	 
	
	public void start() {
		
	}
	
	public int lanceDe() {
		return (int) (random.nextInt(7));
	}
	
	public void duel() {
		
	}
	

}

