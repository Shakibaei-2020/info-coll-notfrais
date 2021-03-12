import java.util.ArrayList;
import java.util.Scanner;


public class collaborateur {
	
	private String prenomCollab;
	private String nomCollab;
	private String societeCollab;
	private String postCollab;
	
	 static ArrayList<collaborateur> listCollab = new ArrayList<collaborateur>();	
	
	 public collaborateur(String prenomCollab, String nomCollab, String societeCollab, String postCollab) {
	        this.prenomCollab = prenomCollab;
	        this.nomCollab = nomCollab;
	        this.societeCollab = societeCollab;
	        this.postCollab = postCollab;
	    }
	 
	 
	 public String getprenomCollab() {
			return prenomCollab;
		}
	 
	 public String setprenomCollab(String prenomCollab) {
			return this.prenomCollab = prenomCollab;
		}
	 
	 public String getnomCollab() {
		 return nomCollab;
	 }
	 public String setnomCollab(String nomCollab) {
		 return this.nomCollab = nomCollab;
	 }
	
	 public String getsocieteCollab() {
		 return societeCollab;
	 }
	 public String setsocieteCollab(String societeCollab) {
		 return this.societeCollab = societeCollab;
	 }
	 
	 public String setpostCollab() {
		 return postCollab;
	 }
	 public String setpostCollab(String postCollab) {
		 return this.postCollab = postCollab;
	 }
	 
	 

	public static void deleteCollab(String p) {
		for(int i = 0 ; i < listCollab.size(); i++)
			   if(listCollab.get(i).nomCollab.equals(p)) {
				   listCollab.remove(i);
			   }
	}
	
	public static void updateCollab(String p) {
		
		  Scanner sc = new Scanner(System.in); 

	        String nom = sc.nextLine(); 
	        String prenom = sc.nextLine(); 
	        String societe = sc.nextLine(); 
	        String post = sc.nextLine(); 

			collaborateur e = new collaborateur(nom,prenom,societe,post);
        
		for(int i = 0 ; i < listCollab.size(); i++)
			   if(listCollab.get(i).nomCollab.equals(p)) {
				   listCollab.set(i,e);
			   }
	}
	
	
	public static void showCollab() {
		for(int i = 0; i < listCollab.size(); i++) {   
			System.out.println(listCollab.get(i).nomCollab);
			
			/**System.out.println(listCollab.get(i).prenomCollab);
			System.out.println(listCollab.get(i).societeCollab);
			System.out.println(listCollab.get(i).postCollab);**/
	}
	
}
	public static void addCollab() {
		
        Scanner sc = new Scanner(System.in); 

        String nom = sc.nextLine(); 
        String prenom = sc.nextLine(); 
        String societe = sc.nextLine(); 
        String post = sc.nextLine(); 

		collaborateur e = new collaborateur(nom,prenom,societe,post);
		listCollab.add(e);
	}
}
