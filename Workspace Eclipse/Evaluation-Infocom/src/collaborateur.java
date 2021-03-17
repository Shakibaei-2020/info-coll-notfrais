import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class collaborateur {
	// Pour les noms des classes, il y a des conventions de nommage � respecter et ici il te faut la 1�re lettre en majuscule
	// L'ajout d'un attribut id de type "int" fera que ton objet sera unique
	private String prenomCollab;
	private String nomCollab;
	private String societeCollab;
	private String postCollab;	
	private List<notedefrais> ntFrais;
	
	
//	Le static te permettra de partager cette liste avec les autres instances de cet objet.
//	On a tendance � l'attribuer � une constante ou une variable qui est modifi�e tour � tour
//	Ici, t'as une m�thode add dans ta class, je te recommande fortement de mettre cette liste dans ton main
	 static ArrayList<collaborateur> listCollab = new ArrayList<collaborateur>();	
	 
//	 Il faut toujours remettre le contructeur par d�faut (vide), il est souvent utile et �cras� une fois que tu d�clares ton constructeur avec des arguments
	 public collaborateur(String prenomCollab, String nomCollab, String societeCollab, String postCollab) {
	        this.prenomCollab = prenomCollab;
	        this.nomCollab = nomCollab;
	        this.societeCollab = societeCollab;
	        this.postCollab = postCollab;
	    }
	 

//	 Faudra pr�ciser le type de donn�es dans ta liste List<notedefrais>
	 public List getList() {
		 return ntFrais;
		 
	 }
//	 M�me remarque Faudra pr�ciser le type de donn�es dans ta liste List<notedefrais>
	 public void setList(List ntFrais) {
		  this.ntFrais = ntFrais;
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
	 
//	Une fois que tu vas extraire ta liste de collaborateur dans ton mai, il faut la communiquer en arguments ici, style : deleteCollab(Liste<notedefrais> listCollab, String p)

	public static void deleteCollab(String p) {
		for(int i = 0 ; i < listCollab.size(); i++)
			   if(listCollab.get(i).nomCollab.equals(p)) {
				   listCollab.remove(i);
			   }
	}
	
//	M�me remarque
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
	
//	M�me remarque	
	public static void showCollab() {
		for(int i = 0; i < listCollab.size(); i++) {   
//			A �viter les systeme.out... dans les m�thodes, vaut vieux les g�r�er en IHM
			System.out.println(listCollab.get(i).nomCollab);
			/**System.out.println(listCollab.get(i).prenomCollab);
			System.out.println(listCollab.get(i).societeCollab);
			System.out.println(listCollab.get(i).postCollab);**/
	}
	
}
	public static void addCollab() {
//		A �viter les Scanner dans les m�thodes, vaut vieux les g�r�er en IHM et tu gardes une m�thodes addCollab(Collaborateur collaborateur)
        Scanner sc = new Scanner(System.in); 

        String nom = sc.nextLine(); 
        String prenom = sc.nextLine(); 
        String societe = sc.nextLine(); 
        String post = sc.nextLine(); 

		collaborateur e = new collaborateur(nom,prenom,societe,post);
		listCollab.add(e);
	}



	@Override
	public String toString() {
		return "collaborateur [prenomCollab=" + prenomCollab + ", nomCollab=" + nomCollab + ", societeCollab="
				+ societeCollab + ", postCollab=" + postCollab + ", ntFrais=" + ntFrais + "]";
	}
	
	
}
