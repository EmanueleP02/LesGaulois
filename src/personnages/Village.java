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
		System.out.println("Dans le village du chef "+ chef.getNom() + " vivent les légendaires gaulois :");
		for (i = 0; i < villageois)
	}
	public static void main(String[] args) {
		Village village = new Village ("Village des Irréductibles",  30) ;
		Chef abraracourcix = new Chef ("Abraracourcix", 6, village) ;
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois ("Astérix", 8);
		village.ajouterHabitant(asterix);
		
	}
} 
