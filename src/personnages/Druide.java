package personnages;
import java.util.*;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion;
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		this.forcePotion = 1;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � "
				+ effetPotionMax + ".");
}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	public String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public void preparerPotion() {
		Random random = new Random();
		int forceP = random.nextInt(effetPotionMax);
		if (forceP > 7) {
			parler("J'ai pr�par� une super potion de force "+ forcePotion);
		}
	    else {
	    	parler("Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force " + forcePotion);
	    }
	}
	
	public void booster(Gaulois gaulois) {
		if ("Obélix".equals(gaulois.getNom())) {
			parler("Non, Ob�lix !... Tu n�auras pas de potion magique !");
		}
		else {
			gaulois.boirePotion(forcePotion);
		}
		
	
	
	}
}
