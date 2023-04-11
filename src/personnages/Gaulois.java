package personnages;

public class Gaulois {
	private String nom;
	private int effetPotion;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
	public Gaulois(String nom, int force) { 
		this.nom = nom; 
		this.force = force;
		this.effetPotion = 1;
	}	

	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophee = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
		nbTrophees++) {
			this.trophees[nbTrophees] = trophee[i];
		}
		}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion="  + effetPotion + "]";
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getEffetPotion() {
		return effetPotion;
	}
	public void  boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + Integer.toString(effetPotion) +" fois d�cupl�e.");
	}
}
