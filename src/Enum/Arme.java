package Enum;

public enum Arme {
	POINGS("Poing", 1), SABRE("Sabre", 3), PISTOLET("Pistolet", 5), MOUSQUET("Mousquet", 7);

	private final String nom;
	private final int force;

	Arme(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public int getForce() {
		return this.force;
	}
}
