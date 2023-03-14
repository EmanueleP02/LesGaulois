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
	public static void main(String[] args) {
		Village village = new Village ("Village des Irréductibles",  30) ;
	}
} 
