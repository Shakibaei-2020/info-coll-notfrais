import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class accueil {

	public static void main(String[] args) throws ParseException {
		
	
		// partie collaborateur
		/**
		System.out.println("add1");
		collaborateur.addCollab();
		System.out.println("add2");
		collaborateur.addCollab();
		System.out.println("show1");
		collaborateur.showCollab();
		System.out.println("update momo");
		collaborateur.updateCollab("momo");
		System.out.println("show 2");
		collaborateur.showCollab();
		**/

		//partie notedefrais
		System.out.println("Saisir note de frais");
		notedefrais.addNoteDeFrais();
		notedefrais.addNoteDeFrais();
		notedefrais.showNoteDeFrais();
		notedefrais.fraisParMoisEtAnnee();
	}

}
