package CaseSpeciale;

public class Case {
	private int numero;
	
    public Case(int numero) {
        this.numero = numero;
    }
    
	public int getNumero() {
		return numero;
	}
	
    public boolean estCaseSpeciale() {
        return false;
    }

    public boolean estCaseVictoire() {
        return false; 
    }
}
