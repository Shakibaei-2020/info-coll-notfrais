import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class accueil {

	public static void main(String[] args) throws ParseException {
		
	
		 List<notedefrais> ntFrais = new ArrayList();
		 ntFrais.add(new notedefrais("SHAKIBAEI", 500,"Trafic","12/02/2003"));
		 ntFrais.add(new notedefrais("SHAKIBAEI", 600,"Trafic","12/06/2012"));
		 ntFrais.add(new notedefrais("SHAKIBAEI", 50,"Trafic","18/02/2020"));
		 ntFrais.add(new notedefrais("SHAKIBAEI", 45,"Trafic","12/05/2001"));

		 collaborateur SHAKIBAEI = new collaborateur("Mohammad", "SHAKIABEI", "Infocom", "dev");
		 
		 SHAKIBAEI.setList(ntFrais);
		 
		 for (int i = 0; i < SHAKIBAEI.getList().size(); i++) {
			 System.out.println(SHAKIBAEI.getList().get(i).toString());	
		 }
		 
		 
		 
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
