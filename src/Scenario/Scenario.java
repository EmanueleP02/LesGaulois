package Scenario;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Druide panoramix = new Druide ("Panoramix", 5, 10);
		Gaulois asterix = new Gaulois ("Astérix",  8) ;
		Gaulois obelix = new Gaulois ("Obélix",  10) ;
		Romain minus = new Romain ("Minus",  6) ;
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		while (minus.getForce() > 0) {
			asterix.frapper(minus);
		}
	}

}
