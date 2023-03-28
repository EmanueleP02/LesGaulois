package personnages;

public class Village { 
	private String nom; 
	private Chef chef; 
	private int nbVillageois = 0;
	private Gaulois[] villageois; 
 	public Village(String nom, int nbMaxVillageois) { 
		this.nom = nom; 
		villageois = new Gaulois[nbMaxVillageois];
	} 
	public void setChef(Chef chef) { 
		this.chef = chef; 
	} 
	public String getNom() { 
		return nom; 
	}
	public void ajouterHabitant (Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois ++;
	}
	public Gaulois trouverHabitant(int number) {
		return villageois[number];
	}
	public void afficherVillageois() {
		System.out.println("Dans le village du chef "+chef.getNom() + " vivent les l�gendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
	        System.out.println(villageois[i].getNom());
	    }
	}
	public static void main(String[] args) {
		Village village = new Village ("Village des Irr�ductibles",  30) ;
		Chef abraracourcix = new Chef ("Abraracourcix", 6, village) ;
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois ("Ast�rix", 8);
		village.ajouterHabitant(asterix);
		Gaulois obelix = new Gaulois ("Obélix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
} 
