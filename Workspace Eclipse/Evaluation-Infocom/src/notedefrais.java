import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;



public class notedefrais {
	
	private String nom;
	private int somme;
	private String raison;
	private String date;

	
 static ArrayList<notedefrais> ListNote = new ArrayList<notedefrais>();	
	
	 public notedefrais(String nom, int somme, String raison, String date) {
	        this.nom = nom;
	        this.somme = somme;
	        this.raison = raison;
	        this.date = date;
	    }
	 
	 
	 
	public String getNom() {
	return nom;
	}
	public String setNom(String nom) {
		return this.nom = nom;
	}
	public int getSomme() {
		return somme;
	}
	public int setSomme(int somme) {
		return this.somme = somme;
	}
	public String getRaison() {
		return raison;
	}
	public String setRaison(String raison) {
		return this.raison = raison;
	}
	public String getDate() {
		return date;
	}
	public String setDate(String date) {
		return this.date = date;
	}
		
	public static void deleteNoteDeFrais(String p) {
		for(int i = 0 ; i < ListNote.size(); i++)
			   if(ListNote.get(i).nom.equals(p)) {
				   ListNote.remove(i);
			   }
	}
	
	public static void updateNoteDeFrais(String p) {
		
		  Scanner sc = new Scanner(System.in); 
		  
			System.out.println("Saisir nom");
	        String nom = sc.nextLine(); 
			System.out.println("Saisir somme");
	        int somme = sc.nextInt(); 
			System.out.println("Saisir raison");
	        String raison = sc.nextLine(); 
			System.out.println("Saisir date format dd/MM/yyyy");
	        String date = sc.nextLine(); 

			notedefrais e = new notedefrais(nom,somme,raison,date);
      
		for(int i = 0 ; i < ListNote.size(); i++)
			   if(ListNote.get(i).nom.equals(p)) {
				   ListNote.set(i,e);
			   }
	}
	
	
	public static void showNoteDeFrais() {
		for(int i = 0; i < ListNote.size(); i++) {   
			System.out.println(ListNote.get(i).nom);
			System.out.println(ListNote.get(i).somme);
			System.out.println(ListNote.get(i).raison);
			System.out.println(ListNote.get(i).date);
		}
	}
	
	public static void addNoteDeFrais() {
		
		 Scanner sc = new Scanner(System.in); 
		 Scanner ss = new Scanner(System.in); 

		 	
			System.out.println("Saisir nom");
	        String nom = sc.nextLine(); 
	        
			System.out.println("Saisir somme");
	        int somme = ss.nextInt(); 
	        
			System.out.println("Saisir raison");
	        String raison = sc.nextLine();
	        
			System.out.println("Saisir date dd/MM/yyyy");
	        String date = sc.nextLine(); 
	        
	        
			notedefrais e = new notedefrais(nom,somme,raison,date);
			ListNote.add(e);
		
	}
	
	
	public static void trieTouteDate() throws ParseException{
				
		List<Date> tabDate = new ArrayList<Date>();	
		  
		for(int i = 0; i < ListNote.size(); i++) {  
		
			String sDate1 = ListNote.get(i).date;
			
			Date Date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
			
			
			tabDate.add(Date1);
		}
		
		tabDate.sort(null);
		for(int i = 0; i < tabDate.size(); i++) {  
			
		System.out.println(tabDate.get(i) + " somme est de " + ListNote.get(i).somme);
		}
		
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		notedefrais other = (notedefrais) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		return true;
	}



	public static void sommeNoteDeFraisTotal() {
		int sum = 0;
	
	for(int i = 0; i < ListNote.size(); i++) {   
		int a = ListNote.get(i).somme;
		
		sum = sum + a;
	}
	System.out.println("la somme est de "+ sum);
	}
	
	
	
	public static void fraisParAnnee() throws ParseException {
		
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("Saisir ann?e souhait?");
			
	        int p = sc.nextInt();
		List<Integer> tabDate = new ArrayList<Integer>();	
		  
		for(int i = 0; i < ListNote.size(); i++) {  
			String sDate1 = ListNote.get(i).date;		
			Date Date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
			
			
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(Date1);
			
			int year1 = calendar.get(Calendar.YEAR);
			
			if (p == year1) {
			tabDate.add(year1);
			}
			
		}	

		int sum = 0;
		int nbpersonne = 1;
		
		tabDate.sort(null);
		
		for(int i = 0; i < tabDate.size(); i++) {  
		int a = ListNote.get(i).somme;
		nbpersonne = nbpersonne + i;
		sum = sum + a;
		System.out.println("L'utilisateur"+ListNote.get(i).nom+" en "+tabDate.get(i) + " somme est de " + ListNote.get(i).somme);
		}
		System.out.println("nombre de personne avec frais lors de cette ann?e"+nbpersonne);
		System.out.println("la somme total pour l'ann?e "+ p + "est de "+ sum);
		
		
	}
	
	public void fraisParMois() throws ParseException {
		
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("Saisir mois souhait?");
			
	        int p = sc.nextInt();
	        
		List<Integer> tabDate = new ArrayList<Integer>();	
		  
		for(int i = 0; i < ListNote.size(); i++) {  
			String sDate1 = ListNote.get(i).date;		
			Date Date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
			
			
			Calendar calendarMois = new GregorianCalendar();
			calendarMois.setTime(Date1);
			
			int month1 = calendarMois.get(Calendar.MONTH);
			month1 = month1 +1;
			
			if (p == month1) {
		
			tabDate.add(month1);
			}
		}	
		
		int sum = 0;
		int nbpersonne = 1;
	
		
		for(int i = 0; i < tabDate.size(); i++) {  
		int a = ListNote.get(i).somme;
		nbpersonne = nbpersonne + i;
		sum = sum + a;
		System.out.println("L'tilisateur:"+ListNote.get(i).nom+" a pour frais " + ListNote.get(i).somme+ " car " + ListNote.get(i).raison);
		}
		System.out.println("nombre de personne avec frais lors de ce mois ci :"+nbpersonne);
		System.out.println("Nombre de personne avec des frais: "+ p );
		System.out.println( "Somme total pour le mois: "+ sum);
	}
	
	public static void fraisParMoisEtAnnee() throws ParseException {
		
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("Saisir mois souhait?");
	        int p = sc.nextInt();
	        System.out.println("Saisir annee souhait?");
	        int t = sc.nextInt();
	        
		List<Integer> tabDate = new ArrayList<Integer>();	
		  
		for(int i = 0; i < ListNote.size(); i++) {  
			String sDate1 = ListNote.get(i).date;		
			Date Date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
			
			
			Calendar calendarMois = new GregorianCalendar();
			calendarMois.setTime(Date1);
			
		

			int month1 = calendarMois.get(Calendar.MONTH);
			month1 = month1 +1;
			
			int year12 = calendarMois.get(Calendar.YEAR);
			
			if (p == month1)  {
				if(t == year12) {
					tabDate.add(month1);	
				}		
			}
		}	
		
		int sum = 0;
		int nbpersonne = 1;
	
		
		for(int i = 0; i < tabDate.size(); i++) {  
		int a = ListNote.get(i).somme;
		nbpersonne = nbpersonne + i;
		sum = sum + a;
		System.out.println("L'tilisateur:"+ListNote.get(i).nom+" a pour frais " + ListNote.get(i).somme+ " car " + ListNote.get(i).raison + "le" + ListNote.get(i).date);
		}
		System.out.println("nombre de personne avec frais lors de ce mois/anneee ci :"+nbpersonne);
		System.out.println("Nombre de personne avec des frais: "+ p );
		System.out.println( "Somme total pour le mois: "+ sum);
	}
	
	
}

