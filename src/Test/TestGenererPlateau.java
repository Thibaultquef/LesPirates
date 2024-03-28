package Test;

import jeu.Plateau;
import CaseSpeciale.Case;
import Enum.Effet;

public class TestGenererPlateau {
    public static void main(String[] args) {
        Plateau plateau = new Plateau();

        for (int i = 1; i <= plateau.getnbCases(); i++) {
            Case caze = plateau.getCase(i-1);
            String infoCase = "Case " + i + ": ";

            if (caze.estCaseSpeciale()) {
                Effet effet = ((CaseSpeciale.CaseSpeciale) caze).getEffet();
                infoCase += "Spéciale - Effet: " + effet;
            } else {
                infoCase += "Normale";
            }

            System.out.println(infoCase);
        }
    }
}
